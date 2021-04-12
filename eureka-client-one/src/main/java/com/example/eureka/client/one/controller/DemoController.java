package com.example.eureka.client.one.controller;

import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo 控制类
 *
 * @author fu.yuanming
 * @since 2021-03-16
 */
@RestController
public class DemoController {

  private final Logger logger = LoggerFactory.getLogger(DemoController.class);

  @GetMapping("/v1/uuid")
  public ResponseEntity<String> getUUID() {
    String uuid = UUID.randomUUID().toString();
    logger.info("generate uuid is: {}", uuid);
    return ResponseEntity.ok(uuid);
  }

}
