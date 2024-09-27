package com.bootcamp.demo.calculator.demo_sb_calculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface DatabaseOperation {
  // Read Operation
  @GetMapping(value = "/database/strings/{index}")
  String getString(@PathVariable String index);
  
  // Write Operation (Create new resource) e.g. call other API, update somthings
  @PostMapping(value = "/database/strings/{newString}")
  String addString(@PathVariable String newString);

  @GetMapping(value = "/database/strings/size")
  int getSize();

  @GetMapping(value = "/database/strings")
  public List<String> getStrings();


}
