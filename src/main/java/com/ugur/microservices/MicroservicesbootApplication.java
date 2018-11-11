package com.ugur.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MicroservicesbootApplication {

	@PostConstruct
	public void init() {
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesbootApplication.class, args);
	}
}
