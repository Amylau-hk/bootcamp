package com.bootcamp.demo.calculator.demo_sb_calculator.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
  private String name;
  private LocalDate openDate;
  private List<ReleasedFilm> releasedFilms;
}
