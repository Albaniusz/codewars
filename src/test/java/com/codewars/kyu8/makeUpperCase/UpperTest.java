package com.codewars.kyu8.makeUpperCase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpperTest {
    Upper u = new Upper();

    @Test
    public void testSomething() {
        assertEquals("HELLO", u.MakeUpperCase("hello"));
        assertEquals("HELLO WORLD", u.MakeUpperCase("hello world"));
    }
}
