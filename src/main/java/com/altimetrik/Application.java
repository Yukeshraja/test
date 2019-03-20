package com.altimetrik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Application {

	public static void main(String[] args) {
		System.out.println("App started...miami demo - day 2   Welcome to Articles Publishing Service.");
		SpringApplication.run(Application.class, args);
	}
}
