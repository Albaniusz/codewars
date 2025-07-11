package com.codewars.kyu7.convertTimeToString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeUtilsTest {
    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", TimeUtils.convertTime(90061));
        assertEquals("-1 -1 -1 -1", TimeUtils.convertTime(-90061));
    }
}
