package com.josiah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @title: Goods8081Application
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Goods8081Application {
    public static void main(String[] args) {
        SpringApplication.run(Goods8081Application.class,args);
    }
}
