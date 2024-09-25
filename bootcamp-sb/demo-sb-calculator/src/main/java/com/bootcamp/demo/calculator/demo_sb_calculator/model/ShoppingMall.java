package com.bootcamp.demo.calculator.demo_sb_calculator.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingMall {
  private String name;
  private int area;
  private Cinema cinema;
  

  private List<String> shopCategory;
}
