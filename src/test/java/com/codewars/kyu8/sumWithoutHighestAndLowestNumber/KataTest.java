package com.codewars.kyu8.sumWithoutHighestAndLowestNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[]{6, 2, 1, 8, 10}));
    }
}
