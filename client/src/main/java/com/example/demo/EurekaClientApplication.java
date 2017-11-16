package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaClientApplication {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@GetMapping("/hi")
	public String hi(){
		System.out.println("hhh");
		return "hahaha:"+port;
	}
}
