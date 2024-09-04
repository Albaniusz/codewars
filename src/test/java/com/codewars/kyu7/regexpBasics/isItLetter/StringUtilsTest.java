package com.codewars.kyu7.regexpBasics.isItLetter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isLetter(""));
        assertTrue(StringUtils.isLetter("a"));
        assertTrue(StringUtils.isLetter("X"));
        assertFalse(StringUtils.isLetter("7"));
        assertFalse(StringUtils.isLetter("*"));
        assertFalse(StringUtils.isLetter("ab"));
        assertFalse(StringUtils.isLetter("a\n"));
    }
}
