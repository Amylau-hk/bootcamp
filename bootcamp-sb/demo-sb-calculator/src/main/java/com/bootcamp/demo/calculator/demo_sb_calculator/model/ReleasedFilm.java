package com.bootcamp.demo.calculator.demo_sb_calculator.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReleasedFilm {
  private String name;
  private LocalDate releaseDate;
}
