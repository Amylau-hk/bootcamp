package com.bootcamp.demo.calculator.demo_sb_calculator.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// Spring -> Serialization(Require Getter): Java Object (array, map, object) -> JSON Pain Text

@ToString
@EqualsAndHashCode
@Getter
// @Setter
@AllArgsConstructor
// @NoArgsConstructor
@Builder
public class Bag {
  @JsonProperty(value = "books") // change the attribute name show 
  private List<Book> books;
  private Color color;

  public static enum Color {
    RED, YELLOW, BLUE,;
  }
}
