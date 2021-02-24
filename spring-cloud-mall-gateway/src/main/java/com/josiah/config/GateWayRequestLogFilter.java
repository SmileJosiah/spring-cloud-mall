//package com.josiah.config;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//
///**
// * @title: GateWayRequestLogFileter
// * @description: 日志记录
// * @author: zhuxy  zhuxy@pukkasoft.cn
// * @create: 2021-02-22 17:32
// */
//@Component
//@Slf4j
//public class GateWayRequestLogFilter implements GlobalFilter, Ordered {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//        //记录请求日志 请求数据 响应数据 执行时间
//        System.out.println("path: " + request.getPath());
//        System.out.println("address: " + request.getRemoteAddress());
//        System.out.println("method: " + request.getMethodValue());
//        System.out.println("URI: " + request.getURI());
//        System.out.println("Headers: " + request.getHeaders());
//        Object requestBody = exchange.getAttribute("cachedRequestBodyObject");
//        MultiValueMap<String, String> queryParams = request.getQueryParams();
//        System.out.println("body: "+ request.getQueryParams());
//        return chain.filter(exchange);
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
