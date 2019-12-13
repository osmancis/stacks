package com.stacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.*")
public class StacksApplication {
	public static void main(String[] args) {
		SpringApplication.run(StacksApplication.class, args);
	}

}
