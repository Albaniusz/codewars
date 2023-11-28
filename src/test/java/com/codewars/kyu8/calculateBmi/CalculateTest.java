package com.codewars.kyu8.calculateBmi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }

    @Test
    public void testSelf() {
        assertEquals("Obese", Calculate.bmi(105, 1.80));
    }

    @Test
    public void testBMIx1() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}
