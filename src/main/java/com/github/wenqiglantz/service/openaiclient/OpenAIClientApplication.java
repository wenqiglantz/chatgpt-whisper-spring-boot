package com.github.wenqiglantz.service.openaiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenAIClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenAIClientApplication.class, args);
	}

}
