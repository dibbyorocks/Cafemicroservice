package com.example.springbootdemoproductioneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient

public class SpringbootdemoproductioneurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoproductioneurekaApplication.class, args);
	}

}

