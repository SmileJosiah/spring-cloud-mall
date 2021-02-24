package com.josiah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @title: OrderApplication
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-20 17:33
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Order8084Application {

    public static void main(String[] args) {
        SpringApplication.run(Order8084Application.class,args);
    }
}
