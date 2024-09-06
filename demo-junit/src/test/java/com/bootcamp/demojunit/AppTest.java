package com.bootcamp.demojunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class AppTest {
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

    @Test
    void testSubtract() {
        assertEquals(5, App.subtract(7, 2));
        assertEquals(-5, App.subtract(-7, -2));
        assertEquals(0, App.subtract(0, 0));
        assertEquals(8, App.subtract(10, 2)); // OK

    }

    // x >= 10 && y >= 3
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
        assertTimeout(Duration.ofMillis(100), () -> {
            // Normally, you write the logic here to test....
            Thread.sleep(90);
        });
    }
}
