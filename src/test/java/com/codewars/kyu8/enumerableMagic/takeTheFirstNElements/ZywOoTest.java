package com.codewars.kyu8.enumerableMagic.takeTheFirstNElements;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ZywOoTest {
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}
