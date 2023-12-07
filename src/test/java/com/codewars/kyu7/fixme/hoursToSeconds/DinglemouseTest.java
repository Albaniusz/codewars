package com.codewars.kyu7.fixme.hoursToSeconds;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DinglemouseTest {

    private void doTest(final int h) {
        assertTrue("Sorry, try again :-(", CheckAnswer.hoursToSeconds(h) == Dinglemouse.hoursToSeconds(h));
    }

    @Test
    public void test0() {
        doTest(0);
    }

    @Test
    public void test123() {
        doTest(1);
        doTest(2);
        doTest(3);
    }

    @Test
    public void test24() {
        doTest(24);
    }
}
