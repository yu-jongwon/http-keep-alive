package com.keepalive.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  
  @GetMapping("/test")
  String get() {
    return "Server Hello";
  }

}
