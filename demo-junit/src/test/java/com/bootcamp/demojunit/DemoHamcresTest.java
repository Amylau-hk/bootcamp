package com.bootcamp.demojunit;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DemoHamcresTest {

  // !!! assertThat
  
@Test
    void test() {
      assertThat(App.sum(1, 2), is(equalTo(3)));
      assertThat(App.subtract(1, 2), is(equalTo(-1)));
      assertThat(App.subtract(1, 2), is(not(equalTo(0))));
      String s = null;
      assertThat(s, is(nullValue()));
      s = "abc";
      assertThat(s, is(not(nullValue())));
      String s2 = s;
      assertThat(s, is(sameInstance(s2)));
      String s3 = "abc";
      assertThat(s, is(sameInstance(s3))); // Literal Pool

      // Comparsion
      assertThat(App.sum(40, 2), allOf(
          greaterThan(41), //
          greaterThanOrEqualTo(42),
          lessThan(43),
          lessThanOrEqualTo(42),
          equalTo(42)
      ));

      // String
      assertThat("hello", containsString("ll"));
      assertThat("hello", not(containsString("lll")));
      assertThat("hello", endsWith("lo"));
      assertThat("hello", startsWith("h"));
      assertThat("", is(emptyString()));
    }

    @Test
    void testList() {
      List<String> strings = List.of("abc", "ijk", "xyz");
      assertThat(strings, hasSize(3));
      // !!! contains() -> constains all with ordering
      assertThat(strings, contains("abc", "ijk", "xyz"));
      assertThat(strings, not(contains("abc", "xyz", "ijk")));
      // !!! containsInAnyOrder() -> contains all without ordering
      assertThat(strings, containsInAnyOrder("abc", "ijk", "xyz"));
      assertThat(strings, not(containsInAnyOrder("abc", "xyz")));
      // !!! hasItem
      assertThat(strings, hasItem("ijk"));
      assertThat(strings, hasItems("ijk", "abc"));
      // !!! isEmpty
      assertThat(strings, is(not(empty())));

    }

    @Test
    void testArray() {
      String[] arr = new String[] {"apple", "banana", "orange"};
      assertThat(arr, arrayContaining("apple", "banana", "orange"));
      assertThat(arr, not(arrayContaining("apple", "orange")));
      assertThat(arr, arrayContainingInAnyOrder("banana", "apple", "orange"));
      assertThat(arr, not(arrayContainingInAnyOrder("apple", "orange")));

      assertThat(arr, arrayWithSize(3));

    }

    @Test
    void testPolymorphism() {
      Number number = Long.valueOf(3);
      assertThat(number, is(instanceOf(Long.class)));
      assertThat(number, is(instanceOf(Number.class)));
      assertThat(number, is(instanceOf(Object.class)));

      assertThat(Cat.class, typeCompatibleWith(Animal.class));
      // assertThat(Dog.class, typeCompatibleWith(Animal.class)); // error, as Dog.class is not extends Animal

    }

  
  public static void main(String[] args) {
    // assertEquals(args, args);
    // assertNotEquals(args, args);
    // assertSame(args, args);
    // assertNotSame(args, args);
    // assertThrows(null, null)
  }
  
}
