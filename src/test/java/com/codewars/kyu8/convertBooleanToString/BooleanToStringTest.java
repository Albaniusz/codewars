package com.codewars.kyu8.convertBooleanToString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanToStringTest {
    @Test
    void testTrue() {
        assertEquals("true", BooleanToString.convert(true));
    }

    @Test
    void testFalse() {
        assertEquals("false", BooleanToString.convert(false));
    }
}
