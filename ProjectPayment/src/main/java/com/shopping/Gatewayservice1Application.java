package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Gatewayservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Gatewayservice1Application.class, args);
	}

}
