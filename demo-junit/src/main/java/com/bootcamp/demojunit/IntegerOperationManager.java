package com.bootcamp.demojunit;

import java.util.LinkedList;
import java.util.List;

public abstract class IntegerOperationManager {
  private List<Integer> integers;

  public IntegerOperationManager() {
    this.integers = new LinkedList<>();
  }
  
  public IntegerOperationManager(List<Integer> integers) {
    this.integers = integers;
  }

  public List<Integer> getIntegers() {
    return this.integers;
  }

  public void add(int value) {
    this.integers.add(value);
  }
  
  // public int sum() {
  //   int total = 0;
  //   for (Integer integer : this.integers) {
  //     total += integer;
  //   }
  //   // return total;
  //   return total * 2; // day 2 change, the test case only will error in manager test case not in pocket case
    
  // }

  public abstract int operate();

  
}
