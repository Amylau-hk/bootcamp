package com.bootcamp.demojunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


// !!! This is "Per Class" testing environment
// It will use one object to call all test methods.
// The result is accumulated
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class SolutionTestPerClassTest {
  private int x;

  @BeforeAll
  public static void init() {
    System.out.println("Before all test cases");
  }

  @AfterAll // !!! After all test cases
  public static void close() {
    System.out.println("After All test cases");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("Before Each test case....");
  }

  @AfterEach
  void afterEach() {
    System.out.println("After Each test case....");
  }

  @Test
  @Order(2)
  public void test() {
    this.x++;
    assertEquals(2, this.x);
  }

  @Test
  @Order(1)
  public void test2() {
    this.x++;
    assertEquals(1, this.x);
  }

  // For Reference Only,
  public static void main(String[] args) {
    SolutionTestPerClassTest.init();
    SolutionTestPerClassTest st1 = new SolutionTestPerClassTest();
    // st1.init();
    st1.beforeEach();
    st1.test();
    st1.afterEach();
    st1.test2();
    // st1.close();
    SolutionTestPerClassTest.close();
  }
}
