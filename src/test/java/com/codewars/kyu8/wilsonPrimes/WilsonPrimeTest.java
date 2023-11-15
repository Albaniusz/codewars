package com.codewars.kyu8.wilsonPrimes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WilsonPrimeTest {
    @Test
    public void test1() {
        assertEquals(false, WilsonPrime.am_i_wilson(0));
    }

    @Test
    public void test2() {
        assertEquals(false, WilsonPrime.am_i_wilson(1));
    }

    @Test
    public void test3() {
        assertEquals(true, WilsonPrime.am_i_wilson(5));
    }
}
