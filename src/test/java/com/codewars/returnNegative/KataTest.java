package com.codewars.returnNegative;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
}
