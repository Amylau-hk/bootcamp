package com.bootcamp.demo.calculator.demo_sb_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

	// When server starts, scan the whole spring project, to find any class with component annotation
		// Component annotation: @Controller, @Service, @Configuration, @Repository
public class DemoSbCalculatorApplication {

		public static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		// String s = "abc"; // String object (heap memory)
		// static method
		// ConfigurableApplicationContext springContext = 
		DemoSbCalculatorApplication.context = 
			SpringApplication.run(DemoSbCalculatorApplication.class, args);
	}

	// Spring Boot Application
	// 1. main code compile OK
	// ! 2. Server Starts -> COmponent Scan, create Component, prepare SpringContext
	// 3. Runtime -> Client (Browser) able to call the server

	// Spring = DI (Dependency Injection)(e.g @Autowired) + IOC (Inverse of Control)(e.g Bean)
}
