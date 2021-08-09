package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class HelpServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelpServicesApplication.class, args);
	}
}
