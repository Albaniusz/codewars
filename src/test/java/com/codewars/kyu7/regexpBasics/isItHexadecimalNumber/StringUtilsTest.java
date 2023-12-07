package com.codewars.kyu7.regexpBasics.isItHexadecimalNumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isHexNumber(""));
        assertFalse(StringUtils.isHexNumber("0x"));
        assertTrue(StringUtils.isHexNumber("0"));
        assertTrue(StringUtils.isHexNumber("0xDEADBEEF"));
        assertTrue(StringUtils.isHexNumber("1337bAbe"));
    }

    @Test
    public void custom() {
        assertTrue(StringUtils.isHexNumber("-1"));
        assertTrue(StringUtils.isHexNumber("ab"));
        assertFalse(StringUtils.isHexNumber("0x0xDEADBEEF"));
        assertTrue(StringUtils.isHexNumber("-0xDEADBEEF"));
        assertTrue(StringUtils.isHexNumber("123l"));
        assertTrue(StringUtils.isHexNumber("123L"));
        assertTrue(StringUtils.isHexNumber("123d"));
        assertTrue(StringUtils.isHexNumber("123D"));
    }
}
