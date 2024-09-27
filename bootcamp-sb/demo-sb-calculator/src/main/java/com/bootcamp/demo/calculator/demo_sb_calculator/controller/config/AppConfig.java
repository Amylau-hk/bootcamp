package com.bootcamp.demo.calculator.demo_sb_calculator.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Cat;

@Configuration // Componenet
public class AppConfig { // new AppConfig()
  // create a bean with status

  // ! @Configuration + @Bean (must be a pair to use)
  @Bean(name = "John") // or change name here
  Cat createCat() { // default beanName = method name = createCat
    return new Cat("John"); // Cat
  }

  @Bean(name = "Peter") 
  Cat createCat2() { 
    return new Cat("Peter");
  }

}
