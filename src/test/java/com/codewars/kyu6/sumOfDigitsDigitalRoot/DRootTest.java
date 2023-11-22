package com.codewars.kyu6.sumOfDigitsDigitalRoot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void Test1() {
        assertEquals("Nope!", 7, DRoot.digital_root(16));
    }

    @Test
    public void Test2() {
        assertEquals("Nope!", 6, DRoot.digital_root(456));
    }

    @Test
    public void Test3() {
        assertEquals("Nope!", 4, DRoot.digital_root(4567));
    }

    @Test
    public void Test4() {
        assertEquals("Nope!", 3, DRoot.digital_root(45678));
    }

    @Test
    public void Test5() {
        assertEquals("Nope!", 3, DRoot.digital_root(456789));
    }
}
