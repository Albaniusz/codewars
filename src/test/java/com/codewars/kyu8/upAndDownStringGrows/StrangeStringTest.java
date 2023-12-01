package com.codewars.kyu8.upAndDownStringGrows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrangeStringTest {
    @Test
    void upDownCheck() {
        String upDown = StrangeString.STRANGE_STRING.toUpperCase().toLowerCase();
        int length = StrangeString.STRANGE_STRING.length();
        int upDownLength = upDown.length();
        assertTrue(upDownLength > length,
            "your string: \"" + StrangeString.STRANGE_STRING + "\".length() = " + length + "\n" +
                "after .toUpperCase().toLowerCase():\n" +
                "result     : \"" + upDown + "\".length() = " + upDownLength + "\n" +
                length + " >= " + upDownLength + "\n"
        );
    }
}
