package com.codewars.kyu7.youCantCodeUnderPressure2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void Sample_Tests() {
        Counter mycounter = new Counter();

        mycounter.increment();
        mycounter.increment();
        assertEquals(2, mycounter.check());
    }
}
