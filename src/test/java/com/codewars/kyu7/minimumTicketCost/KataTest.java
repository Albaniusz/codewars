package com.codewars.kyu7.minimumTicketCost;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void basicTests() {
        doTest(2, 0);
        //doTest(4, 10);
        doTest(10, 4);
    }

    private void doTest(final int n, final int expected) {
        assertEquals(expected, Kata.findJane(n));
    }
}
