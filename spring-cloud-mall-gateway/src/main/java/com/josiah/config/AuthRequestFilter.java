package com.josiah.config;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;

import com.josiah.enums.GlobalSystemEnum;
import com.josiah.rsp.BaseResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

/**
 * @title: AuthRequestFilter
 * @description: 权限校验
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 17:58
 */
@Component
public class AuthRequestFilter implements GlobalFilter, Ordered {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders rspHeader = exchange.getResponse().getHeaders();
        rspHeader.setContentType(MediaType.APPLICATION_JSON);
        String path = request.getPath().toString();
        if (!path.contains("login")) {
            String userToken = null;
            MultiValueMap<String, String> queryParams = request.getQueryParams();
            if (!ObjectUtil.isEmpty(queryParams)) {
                userToken = queryParams.getFirst("userToken");
            }
            HttpHeaders headers = request.getHeaders();
            if (!ObjectUtil.isEmpty(headers)) {
                userToken = headers.getFirst("userToken");
            }
            String userStr = redisTemplate.opsForValue().get(userToken);
            if (StrUtil.isBlank(userStr)){
                byte[] bytes = JSONUtil.toJsonStr(BaseResp.error(GlobalSystemEnum.TOKEN_ILLEGAL)).getBytes(StandardCharsets.UTF_8);
                DataBuffer buffer = exchange.getResponse()
                        .bufferFactory().wrap(bytes);
                return exchange.getResponse().writeWith(Flux.just(buffer));
            }
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
