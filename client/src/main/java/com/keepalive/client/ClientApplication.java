package com.keepalive.client;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import reactivefeign.spring.config.EnableReactiveFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableReactiveFeignClients
public class ClientApplication {

	@Autowired
	private ApiClient client;

	@Autowired
	private ApiReactiveClient reactiveClient;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@PostConstruct
    public void postConstruct() {
		client.getWithKeepalive();
		client.getWithKeepalive();

		// client.getWithoutKeepalive();
		// client.getWithoutKeepalive();

		// reactiveClient.getWithKeepalive().subscribe();
		// reactiveClient.getWithKeepalive().subscribe();

		// reactiveClient.getWithoutKeepalive().subscribe();
		// reactiveClient.getWithoutKeepalive().subscribe();
    }

}
