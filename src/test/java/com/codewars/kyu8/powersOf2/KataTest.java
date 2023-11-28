package com.codewars.kyu8.powersOf2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KataTest {
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, Kata.powersOfTwo(0));
        assertArrayEquals(new long[]{1, 2}, Kata.powersOfTwo(1));
        assertArrayEquals(new long[]{1, 2, 4, 8, 16}, Kata.powersOfTwo(4));
    }
}
