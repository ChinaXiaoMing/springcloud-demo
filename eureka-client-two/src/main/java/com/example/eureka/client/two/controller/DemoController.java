package com.example.eureka.client.two.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Demo 控制类
 *
 * @author fu.yuanming
 * @since 2021-03-16
 */
@RestController
public class DemoController {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/v1/id")
  public ResponseEntity<String> getId() {
    ResponseEntity<String> result = restTemplate.getForEntity("http://eureka-client-one/v1/uuid", String.class);
    String uuid = result.getBody();
    logger.info("request id: {}", uuid);
    assert uuid != null;
    return ResponseEntity.ok(uuid);
  }

}
