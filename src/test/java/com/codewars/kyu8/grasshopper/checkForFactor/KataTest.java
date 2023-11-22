package com.codewars.kyu8.grasshopper.checkForFactor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void basicTests() {
        assertEquals(true, Kata.checkForFactor(10, 2));
        assertEquals(true, Kata.checkForFactor(63, 7));
        assertEquals(true, Kata.checkForFactor(2450, 5));
        assertEquals(true, Kata.checkForFactor(24612, 3));
    }
}
