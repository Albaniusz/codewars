package com.codewars.kyu8.whatIsBetween;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KataTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Kata.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, Kata.between(-2, 2));
    }
}
