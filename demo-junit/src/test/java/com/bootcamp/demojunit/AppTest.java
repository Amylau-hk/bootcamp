package com.bootcamp.demojunit;

// !!! "static import" is for static method call.
// !!! After "static import", you can call the static method by the method name directly.
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTest { // can no "public", if do not neet to asscess in other workbook

    // !!! After adding dependncy "junit-jupiter-params", you can use ParameterizedTest & CsvSource
    @ParameterizedTest
    @CsvSource({"3,1,2", "0,0,0", "-9, -11, 2"})
    void testSum(int expected, int x, int y) {
        assertEquals(expected, App.sum(x, y));
    }

    @DisplayName("Test App.sum()")
    @Test
    void testSum() {
    assertEquals(5, App.sum(3, 2));
    assertEquals(-2, App.sum(-2, 0));
    assertEquals(0, App.sum(0, 0));

    // assertEquals(-5, App.sum(-3, -2));
    // assertEquals(8, App.sum(10, 2)); // fails

    // day 2 requiremnt after... the test above need to revised
    // retest!!!
    assertEquals(14, App.sum(8, 6));
    }

    @DisplayName("Test App.subtract()")
    @Test
    void testSubtract() {
        assertEquals(5, App.subtract(7, 2));
        assertEquals(-5, App.subtract(-7, -2));
        assertEquals(0, App.subtract(0, 0));
        assertEquals(8, App.subtract(10, 2)); // OK

    }

    // x >= 10 && y >= 3
    @DisplayName("Test App.combine()")
    @Test 
    void testCombine() {
        // Scenario 1: x >= 10 and y >= 3 -> subreact()
        assertEquals(7, App.combine(10, 3));
        // Scenario 2: x < 10 and y >= 3 -> sum()
        assertEquals(12, App.combine(9, 3));
        // Scenario 3: x >= 10 and y < 3 -> sum()
        assertEquals(12, App.combine(10, 2));
        // Scenario 4: x < 10 and y < 3 -> sum()
        assertEquals(11, App.combine(9, 2));

        assertEquals(8, App.combine(11, 3)); // meaning less
        // !!! because the test case is testing the same thing with App.combine(10, 3)

    }

    @Test
    void testAssert() {
        String s1 = new String("abc");
        String s2 = new String("abc");
        assertNotSame(s1, s2);

        String s3 = s2;
        assertSame(s2, s3);

        String s4 = null;
        assertNull(s4);
        assertNotNull(s3);
    }

    // will the code throw exception
    @Test
    void testThrow() {
     assertThrows(ArithmeticException.class, ()-> {
        App.divide(10, 0);
    });

    // !!! Common
     assertDoesNotThrow(()-> {
        App.divide(10, 1);
     });
    }

    @Test
    void testArray() {
        int [] arr = new int[] {1, 2, 3};
        int [] arr2 = new int[] {1, 2, 3};
        assertArrayEquals(arr, arr2); // check both ordering & element
    }

    @Test
    void testAssertll() {
        assertAll (
            // assertequal can be use toooooo
            () -> assertEquals(5 , App.sum(3, 2)),
            () -> assertEquals (8, App.subtract(10, 2))
        );
    }

    // Non-functional requirement
    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(200), () -> {
            // Normally, you write the logic here to test....
            Thread.sleep(90);
        });
    }
}
