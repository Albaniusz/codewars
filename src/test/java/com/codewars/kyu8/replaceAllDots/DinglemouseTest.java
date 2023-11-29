package com.codewars.kyu8.replaceAllDots;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DinglemouseTest {
    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(Dinglemouse.replaceDots("one.two.three")));
    }
}
