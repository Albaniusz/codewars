package com.codewars.kyu7.tenGreenBottles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinglemouseTest {

    @Test
    public void ex() {
        final String expected =
            "Two green bottles hanging on the wall,\n" +
                "Two green bottles hanging on the wall,\n" +
                "And if one green bottle should accidentally fall,\n" +
                "There'll be one green bottle hanging on the wall.\n" +
                "\n" +
                "One green bottle hanging on the wall,\n" +
                "One green bottle hanging on the wall,\n" +
                "If that one green bottle should accidentally fall,\n" +
                "There'll be no green bottles hanging on the wall.\n";
        assertEquals(expected, Dinglemouse.tenGreenBottles(2));
    }

    @Test
    public void three() {
        final String expected =
            "Three green bottles hanging on the wall,\n" +
                "Three green bottles hanging on the wall,\n" +
                "And if one green bottle should accidentally fall,\n" +
                "There'll be two green bottles hanging on the wall.\n" +
                "\n" +
                "Two green bottles hanging on the wall,\n" +
                "Two green bottles hanging on the wall,\n" +
                "And if one green bottle should accidentally fall,\n" +
                "There'll be one green bottle hanging on the wall.\n" +
                "\n" +
                "One green bottle hanging on the wall,\n" +
                "One green bottle hanging on the wall,\n" +
                "If that one green bottle should accidentally fall,\n" +
                "There'll be no green bottles hanging on the wall.\n";
        assertEquals(expected, Dinglemouse.tenGreenBottles(3));
    }

    @Test
    public void max() {
        final String expected =
            "Two green bottles hanging on the wall,\n" +
                "Two green bottles hanging on the wall,\n" +
                "And if one green bottle should accidentally fall,\n" +
                "There'll be one green bottle hanging on the wall.\n" +
                "\n" +
                "One green bottle hanging on the wall,\n" +
                "One green bottle hanging on the wall,\n" +
                "If that one green bottle should accidentally fall,\n" +
                "There'll be no green bottles hanging on the wall.\n";
        assertEquals(expected, Dinglemouse.tenGreenBottles(10));
    }

}
