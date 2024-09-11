package com.bootcamp.demojunit;

public class IntegerAdditionManager extends IntegerOperationManager {
  @Override
  public int operate() {
    int total = 0;
    for (Integer integer : super.getIntegers()) {
      total += integer;
    }
    return total * 2;
  }
 
}
