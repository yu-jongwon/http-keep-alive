package com.keepalive.client;

import org.springframework.web.bind.annotation.GetMapping;

import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;

@ReactiveFeignClient(name = "test", url = "http://localhost:8080/test")
public interface ApiReactiveClient {

    @GetMapping(value = "/")
    Flux<String> getWithKeepalive();

    @GetMapping(value = "/", headers = "Connection=close")
    Flux<String> getWithoutKeepalive();
    
}
