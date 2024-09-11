package com.bootcamp.demojunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.Calendar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bootcamp.demojunit.Calculator.Calculator;

// Test Instance -> Method
@ExtendWith(MockitoExtension.class)
public class IntegerpocketTest {

  // !!! inject a fake object (all instance methods without actual implementations)
  @Mock
  private IntegerOperationManager operationManager;

  // !!! inject a real object (all instance methods with actual implementations)
  // can use tgt with @Mock for testing the partial code
  @Spy
  private Calculator calculator;

  // !!! Look for a constructor to create IntegerPocket Object
  // !!! "public IntegerPocket(IntegerOperationManager operationManager)"
  // !!! Look for IntegerOperationManager Object
  // !!! You have mocked the IntegerOperationManager object
  // !!! Finally created this integerPocket object.
  @InjectMocks
  private IntegerPocket integerPocket;

  // !!! Why do we need to @Mock?
  // !!! IntegerPocket sum() call operationManager's sum()
  @Test
  void testSum1() {
    // Assumption
    // Mockito.when(operationManager.sum()).thenReturn(-1);
    // Mockito.when(operationManager.operate()).thenReturn(-1);
    Mockito.when(operationManager.operate()).thenReturn(11); // !!! Test Scenario of "result > 10"

    // Test IntegerPocket sum()
    // IntegerPocket integerPocket = new IntegerPocket(this.operationManager); // after @InjectMocks created
    // integerPocket.add(3);
    // integerPocket.add(10);
    // integerPocket.add(2);
    this.integerPocket.add(3);
    this.integerPocket.add(10);
    this.integerPocket.add(2);
    // int result = integerPocket.sum();
    int result = this.integerPocket.sum();
    assertEquals(14, result); // testing the sum() in IntegerPocket whether +3 in any result
    // working on the addtional part of the code
    // as the main part of the code should do the test indiviually

    // !!! Verify if the process of "integerPocket.sum()" was calling operationManager.operate()
    verify(this.operationManager, times(1)).operate(); // need to verify when @Mock is using
  }

  @Test
  void testSum2() {
    // Assumption
    // Mockito.when(operationManager.sum()).thenReturn(-1);
    // Mockito.when(operationManager.operate()).thenReturn(-1);
    Mockito.when(operationManager.operate()).thenReturn(10); // !!! Test Scenario of "result <= 10"

    // Test IntegerPocket sum()
    // IntegerPocket integerPocket = new IntegerPocket(this.operationManager);
    // int result = integerPocket.sum();
    int result = this.integerPocket.sum();
    assertEquals(7, result); 
    verify(this.operationManager, times(1)).operate(); 
}


  // Part of integration Test
  @Test
  void testCalculator() {
    Mockito.when(this.calculator.sum(3, 2)).thenReturn(20); // !!! Override sum()
    int result = this.integerPocket.compute(3, 2);
    assertEquals(24, result); // 20 + (3-2) + 3
}

  // Part of integration Test
  @Test
  void testCalculator2() {
    Mockito.when(this.calculator.substract(3, 2)).thenReturn(50); // Override substract()
    int result = this.integerPocket.compute(3, 2);
    assertEquals(58, result); // (3 + 2) + 50 + 3
  }

  // Unit Test
  @Test
  void testCalculator3() {
    Mockito.when(this.calculator.sum(3, 2)).thenReturn(99);
    Mockito.when(this.calculator.substract(3, 2)).thenReturn(1);
    int result = this.integerPocket.compute(3, 2);
    assertEquals(103, result); // 99 + 1 + 3
}

}