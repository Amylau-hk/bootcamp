package com.bootcamp.demojunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerOperationManagerTest {

  @Test
  void testSum() {
    // IntegerOperationManager manager = new IntegerOperationManager();
    IntegerOperationManager manager = new IntegerAdditionManager();
    manager.add(3);
    manager.add(10);
    manager.add(2);
    // assertEquals(30, manager.sum());
    assertEquals(30, manager.operate());

  }
  
}
