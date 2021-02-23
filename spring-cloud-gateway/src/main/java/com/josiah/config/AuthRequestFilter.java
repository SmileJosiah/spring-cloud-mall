package com.josiah.config;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

            if (StrUtil.isBlank(userToken)){
                DataBuffer buffer = exchange.getResponse()
                        .bufferFactory().wrap(HttpStatus.UNAUTHORIZED.getReasonPhrase().getBytes());
                return exchange.getResponse().writeWith(Flux.just(buffer));
            }
            String userStr = redisTemplate.opsForValue().get(userToken);
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
