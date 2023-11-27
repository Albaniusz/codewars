package com.codewars.kyu8.unexpectedParsing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void test() {
        assertEquals("busy", Kata.getStatus(true).get("status"));
        assertEquals("available", Kata.getStatus(false).get("status"));
    }
}
