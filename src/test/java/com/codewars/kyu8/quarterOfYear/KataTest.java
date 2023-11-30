package com.codewars.kyu8.quarterOfYear;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void exampleTests() {
        assertEquals(1, Kata.quarterOf(3));
        assertEquals(3, Kata.quarterOf(8));
        assertEquals(4, Kata.quarterOf(11));
    }
}
