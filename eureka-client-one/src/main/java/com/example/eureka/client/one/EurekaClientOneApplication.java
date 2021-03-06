package com.example.eureka.client.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientOneApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaClientOneApplication.class, args);
  }

}
