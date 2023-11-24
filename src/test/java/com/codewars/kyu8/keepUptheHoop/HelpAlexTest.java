package com.codewars.kyu8.keepUptheHoop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelpAlexTest {
    @Test
    public void testHoopCount() {
        assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
        assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
    }
}
