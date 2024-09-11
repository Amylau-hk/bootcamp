package com.bootcamp.demojunit;

import java.util.ArrayList;
import java.util.List;
import com.bootcamp.demojunit.Calculator.Calculator;

public class IntegerPocket {
  private List<Integer> integers;
  private IntegerOperationManager operationManager;
  private Calculator calculator;

  public IntegerPocket(IntegerOperationManager operationManager, Calculator calculator) {
    this.integers = new ArrayList<>();
    this.operationManager = operationManager;
    this.calculator = calculator;
  }

  // public IntegerPocket(Calculator calculator) {
  //   this.calculator = calculator;
  // }

  public void add(int integer) {
    this.integers.add(integer);
    // 
    this.operationManager.add(integer);
  }

  public int sum() {
    // return this.operationManager.sum() + 3;
    // return this.operationManager.operate() + 3;
    int result = this.operationManager.operate();
    if (result > 10) 
      return result + 3;
    return result - 3;
  }

  public int compute(int x, int y) {
    return this.calculator.sum(x, y) + this.calculator.substract(x, y) + 3;

  }
  public static void main(String[] args) {
    // 3, 10, 12
    // IntegerPocket pocket = new IntegerPocket(new IntegerOperationManager());
    IntegerPocket pocket = new IntegerPocket(new IntegerAdditionManager(), new Calculator());
    pocket.add(3);
    pocket.add(10);
    pocket.add(12);
    System.out.println(pocket.sum()); // 25
  }
  
}
