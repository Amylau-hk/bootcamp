package com.bootcamp.demo.calculator.demo_sb_calculator.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
  private int id;
  private double price;
  private List<String> strings; //dummy data
  
}
