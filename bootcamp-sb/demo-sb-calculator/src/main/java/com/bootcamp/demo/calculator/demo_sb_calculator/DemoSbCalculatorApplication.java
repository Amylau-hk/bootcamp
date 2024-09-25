package com.bootcamp.demo.calculator.demo_sb_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 1. @SpringBootConfiguration
// 2. @EnableAutoConfiguration
// 3. @ComponentScan
	// -  What is Bean?
		// The object lifecycle is managed by someone, but not you.
		// In Spring, most of the beans are created during server start.
	// - What is Component?
		// A class that used to create bean, we call it Component. i.e. @Controller
		// can become Beans
public class DemoSbCalculatorApplication {

	public static void main(String[] args) {
		String s = "abc"; // String object (heap memory)
		// static method
		SpringApplication.run(DemoSbCalculatorApplication.class, args);
	}

}
