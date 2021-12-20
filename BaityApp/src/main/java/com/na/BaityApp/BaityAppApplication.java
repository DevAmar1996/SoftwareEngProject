package com.na.BaityApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BaityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaityAppApplication.class, args);
	}

}
