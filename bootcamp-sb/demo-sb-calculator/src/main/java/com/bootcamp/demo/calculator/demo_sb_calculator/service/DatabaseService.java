package com.bootcamp.demo.calculator.demo_sb_calculator.service;

import org.springframework.stereotype.Service;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Database;

@Service // Component -> bean
public class DatabaseService {

  public String getString(int index) {
    return Database.getString(index);
  }

  public String addString(String newString) {
    return Database.addString(newString);
  }
  
}
