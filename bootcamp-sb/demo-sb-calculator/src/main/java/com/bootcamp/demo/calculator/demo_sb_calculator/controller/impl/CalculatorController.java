package com.bootcamp.demo.calculator.demo_sb_calculator.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CalculatorController {

  @GetMapping(value = "/sum/{a}/{b}")
  public String sum(@PathVariable(value = "b") int x, 
    @PathVariable(value = "a") int y) {
    System.out.println("x=" + x + ", y=" + y);
    return String.valueOf(x+y);
  }
  
  @GetMapping(value = "/divide/{a}/{b}")
  public String divide(@PathVariable int a, 
    @PathVariable int b) {
     try {
      return String.valueOf(a / b);
     } catch (ArithmeticException e) {
      return "Not support / by zero";
     }
  }

  @GetMapping(value = "/subtract/{x}/{y}")
  public String subtract(@PathVariable String x, 
    @PathVariable String y) { // auto-box
    try {
      return String.valueOf(Long.parseLong(x) - Long.parseLong(y));
    } catch (NumberFormatException e) {
      return "The input params should be a number";
    }
  }
}
