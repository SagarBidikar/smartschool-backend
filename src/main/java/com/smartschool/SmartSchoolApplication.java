package com.smartschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.smartschool"})
public class SmartSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartSchoolApplication.class, args);
		System.out.println("Hi spring boot is running");
	}
}
