package com.codewars.kyu7.lombokEncapsulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncapsulationDemoTest {
    @Test
    public void testSample() {
        EncapsulationDemo ed = new EncapsulationDemo();
        assertEquals(
            0,
            ed.getNumber()
        );
    }
}
