package com.bootcamp.sb.demo_sb_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloworldController {
  
  // !!! Java object.greeting()
  @GetMapping(value = "/v1/hello")  // identify the entry
  public String greeting () {
    System.out.println("this is greeting ...."); // log 
  return "hello";
  }

  // ctrl + c : kill 
  // 1. mvn clean install
  // 2. mvn spring-boot run
  

    // !!! Java object.greeting()
    @GetMapping(value = "goodbye")  // path cannot be duplicated
    public String goodbye () {
    return "goodbye";
    }
}
