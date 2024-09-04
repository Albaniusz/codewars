package com.codewars.kyu7.theSpeedOfLetters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void exampleTests() {
        assertEquals("AZ", "A                         Z");
        assertEquals("ABC", "A B C");
        assertEquals("ACE", "A  C  E");
        assertEquals("CBA", "  A");
        assertEquals("HELLOWORLD", "     E H    DLL   OLO   R  W");
    }
}
