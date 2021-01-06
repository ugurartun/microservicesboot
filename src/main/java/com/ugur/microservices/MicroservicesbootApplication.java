package com.ugur.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MicroservicesbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesbootApplication.class, args);
	}
}
