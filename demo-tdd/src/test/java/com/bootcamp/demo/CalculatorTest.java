package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  // private Calculator calculator;

  // requirement change: if number of intger > 2, return the first element
  @Test
  void testSum() {
    // assertEquals(15, new Calculator(Arrays.asList(3, 10, 2)).sum());
    // assertEquals(99, new Calculator(Arrays.asList(-3, 100, 2)).sum());
    assertEquals(3, new Calculator(Arrays.asList(3, 10, 2)).sum());
    assertEquals(-3, new Calculator(Arrays.asList(-3, 100, 2)).sum());
    assertEquals(0, new Calculator(Arrays.asList(0, 0)).sum());
    assertEquals(0, new Calculator(Arrays.asList()).sum());
  }
  
}
