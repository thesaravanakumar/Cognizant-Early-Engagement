package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class TmsApplication {
	/**
	 * Starting point of the application
	 * 
	 * @param args Arguments passed to the application
	 */
	public static void main(String[] args) {
		SpringApplication.run(TmsApplication.class, args);
	}
}
