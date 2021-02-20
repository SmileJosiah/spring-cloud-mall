package com.josiah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: OrderApplication
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-20 17:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order8084Application {

    public static void main(String[] args) {
        SpringApplication.run(Order8084Application.class,args);
    }
}
