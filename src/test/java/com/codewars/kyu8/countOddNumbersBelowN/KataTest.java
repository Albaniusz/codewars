package com.codewars.kyu8.countOddNumbersBelowN;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void fixedTests() {
        assertEquals(7, Kata.oddCount(15));
        assertEquals(7511, Kata.oddCount(15023));
    }

    @Test
    public void custom() {
        assertEquals(3, Kata.oddCount(7));
        assertEquals(7, Kata.oddCount(15));
        assertEquals(10, Kata.oddCount(20));
        assertEquals(10, Kata.oddCount(21));
        assertEquals(11, Kata.oddCount(22));
    }

    @Test
    public void outside() {
        assertEquals(1043136988, Kata.oddCount(2_086_273_976));
    }
}
