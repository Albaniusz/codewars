package com.codewars.kyu8.theWideMouthedFrog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WideMouthedFrogTest {

    @Test
    public void fixedTests() {
        assertEquals("wide", WideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide", WideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", WideMouthedFrog.mouthSize("alligator"));
    }
}
