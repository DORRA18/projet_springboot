package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class PredictionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PredictionApplication.class, args);
	}

}
