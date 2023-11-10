package com.codewars.kyu8.returnNegative;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
}
