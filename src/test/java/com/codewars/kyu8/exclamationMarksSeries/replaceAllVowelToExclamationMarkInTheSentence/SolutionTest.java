package com.codewars.kyu8.exclamationMarksSeries.replaceAllVowelToExclamationMarkInTheSentence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("H!!", Solution.replace("Hi!"));
        assertEquals("!H!! H!!", Solution.replace("!Hi! Hi!"));
        assertEquals("!!!!!", Solution.replace("aeiou"));
        assertEquals("!BCD!", Solution.replace("ABCDE"));
    }
}
