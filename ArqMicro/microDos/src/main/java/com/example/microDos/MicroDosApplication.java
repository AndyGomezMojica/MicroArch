package com.example.microDos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroDosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroDosApplication.class, args);
	}

}
