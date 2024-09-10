package com.bootcamp.demojunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// !!! In test code base, we define the test class based on "testing environment"
// This class "SolutionTest" is a testing environment
// x represents something like environment . For example, successful/ fail counting, etc.
// !!! TestInstance is "per method" by default
// The result is not accumulated.
// @TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class SolutionTestPerMethodTest {
  private int x;

  @BeforeAll // !!! Before all test cases
  static void init() {
    System.out.println("Before ALL test cases");
  }

  @AfterAll // !!! After all test cases
  static void close() {
    System.out.println("After All test cases");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("Before each test case...");
  }

  @AfterEach
  void afterEach() {
    System.out.println("After Each test case...");
  }

  @Test
  void test() {
    System.out.println("test()");
    this.x++;
    assertEquals(1, this.x);
  }
  
  @Test
  void test2() {
    System.out.println("test2()");
    this.x++;
    assertEquals(1, this.x);
  }

  // Junit Frame generate "test code", something like below
  // !!! st1 is a Test Instance, while st2 is another Test Instance.
  // !!! So, it is a "Per Method" Testing Environment
  // For Reference Only,
  public static void main(String[] args) {
    SolutionTestPerMethodTest.init();
    SolutionTestPerMethodTest st1 = new SolutionTestPerMethodTest();
    st1.beforeEach();
    st1.test();
    st1.afterEach();
    SolutionTestPerMethodTest st2 = new SolutionTestPerMethodTest(); // x is an attribute belongs to object
    st2.beforeEach();
    st1.test2();
    st2.afterEach();
    SolutionTestPerMethodTest.close();
  }
}
