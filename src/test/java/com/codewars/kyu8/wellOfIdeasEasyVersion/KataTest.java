package com.codewars.kyu8.wellOfIdeasEasyVersion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void basicTests() {
        assertEquals("Fail!", Kata.well(new String[]{"bad", "bad", "bad"}));
        assertEquals("Publish!", Kata.well(new String[]{"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", Kata.well(new String[]{
            "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
