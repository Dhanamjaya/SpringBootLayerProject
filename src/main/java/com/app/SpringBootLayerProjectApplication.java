package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableScheduling
public class SpringBootLayerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLayerProjectApplication.class, args);
		
		System.out.println("Hello");
		System.out.println("Hi");
	}

}
