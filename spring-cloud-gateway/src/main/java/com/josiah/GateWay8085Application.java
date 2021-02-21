package com.josiah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: spring-cloud-mall
 * @description:
 * @author: zhuxy zhuxy@pukkasoft.cn
 * @date: 2021-02-21 21:49
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWay8085Application {
    public static void main(String[] args) {
        SpringApplication.run(GateWay8085Application.class,args);
    }

}
