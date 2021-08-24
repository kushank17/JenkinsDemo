package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsDemoApplication {
	
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("Second Time Welcome.");
		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);
	}

}
