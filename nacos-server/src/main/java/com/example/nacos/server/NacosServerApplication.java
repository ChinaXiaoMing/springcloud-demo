package com.example.nacos.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * nacos服务启动入口
 *
 * @author fu.yuanming
 * @date 2021-07-16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServerApplication.class, args);
    }

}
