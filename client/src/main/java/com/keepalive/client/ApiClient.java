package com.keepalive.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "http://localhost:8080/test")
public interface ApiClient {

  @GetMapping(value = "/"/*, headers = "Connection=close" */)
  String get();
  
}
