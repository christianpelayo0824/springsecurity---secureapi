package com.springsecurity.secureapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.springsecurity" })
public class SecureapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureapiApplication.class, args);
	}
}
