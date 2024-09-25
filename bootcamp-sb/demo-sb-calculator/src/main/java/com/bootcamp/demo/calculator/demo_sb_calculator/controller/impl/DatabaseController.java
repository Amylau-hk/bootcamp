package com.bootcamp.demo.calculator.demo_sb_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.calculator.demo_sb_calculator.controller.DatabaseOperation;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Database;
import com.bootcamp.demo.calculator.demo_sb_calculator.service.DatabaseService;


@Controller
@ResponseBody
public class DatabaseController implements DatabaseOperation {

  @Autowired
  private DatabaseService databaseService;

  // Task 1: get all strings from the array
  // Task 2: get database size

  @Override
  public String addString(String newString) {
    return databaseService.addString(newString);
  }

  // @Override
  // public String getString(String index) {
  //   boolean isIndexVaild = false;
  //   try {
  //     int idx = Integer.valueOf(index);
  //     if (idx < 0 || idx > Database.size() - 1){
  //       return "Invalid Index. Please try again later.";
  //     }
  //     return databaseService.getString(Integer.valueOf(idx));
  //   } catch (NumberFormatException e) {
  //     return "Invalid Index. Please try again later.";
  //   }
  // }


  @Override
  public String getString(String index) {
    boolean isIndexVaild = false;
    int idx = -1;
    try {
      idx = Integer.valueOf(index);
      } catch (NumberFormatException e) {
        isIndexVaild = false;
      }
      if (idx < 0 || idx > Database.size() - 1){
     isIndexVaild = false;
    } 
    return isIndexVaild ? databaseService.getString(idx)
      : "Invalid Index. Please try again later.";
    }
  }


  
