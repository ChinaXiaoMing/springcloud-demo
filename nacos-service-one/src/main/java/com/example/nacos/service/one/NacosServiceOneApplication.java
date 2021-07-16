package com.example.nacos.service.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * nacos服务一应用程序入口
 *
 * @author fu.yuanming
 * @date 2021-07-16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceOneApplication.class, args);
    }

}
