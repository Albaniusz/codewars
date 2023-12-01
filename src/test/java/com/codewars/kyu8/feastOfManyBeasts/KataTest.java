package com.codewars.kyu8.feastOfManyBeasts;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KataTest {
    @Test
    public void fixedTest() {
        assertTrue(Kata.feast("great blue heron", "garlic nann"));
        assertTrue(Kata.feast("chickadee", "chocolate cake"));
        assertFalse(Kata.feast("brown bear", "bear claw"));
    }
}
