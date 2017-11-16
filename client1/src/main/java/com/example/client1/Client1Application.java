package com.example.client1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class Client1Application {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
	}

	@GetMapping("/hi")
	public String hi(){
		return "hahaha:"+port;
	}
}
