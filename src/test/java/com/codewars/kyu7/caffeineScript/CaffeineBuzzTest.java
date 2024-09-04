package com.codewars.kyu7.caffeineScript;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CaffeineBuzzTest {
    @Test
    public void calculate() {
        assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
        assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
        assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
        assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
    }
}
