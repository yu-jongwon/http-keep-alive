package com.keepalive.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  
  @Autowired
  private ApiClient client;

  @GetMapping("/")
  String get() {
    client.get();
    // client.get();
    return "Client Hello";
  }

}
