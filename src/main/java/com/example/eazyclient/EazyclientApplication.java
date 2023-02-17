package com.example.eazyclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.eazyclient.proxy")
public class EazyclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyclientApplication.class, args);
	}

}
