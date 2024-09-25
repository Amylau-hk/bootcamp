package com.bootcamp.demo.calculator.demo_sb_calculator.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingMall2 {
  private String name;
  private int area;
  private Cinema cinema;
  private List<String> shopCategory;

  public static class Cinema {
     private String name;
     private LocalDate openDate;
     private List<ReleasedFilm> releasedFilms;

     public static class ReleasedFilm {
      private String name;
      private LocalDate releaseDate;
     }
  
    
  }
}

