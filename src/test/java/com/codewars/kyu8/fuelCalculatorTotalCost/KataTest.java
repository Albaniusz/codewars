package com.codewars.kyu8.fuelCalculatorTotalCost;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void dev() {
        assertEquals(9.50d, Kata.fuelPrice(5, 2.0d), 0.001d);
    }

    @Test
    public void attempt() {
        assertEquals(6631.68d, Kata.fuelPrice(192, 34.79d), 0.001d);
    }

    @Test
    public void exampleTests() {
        assertEquals(5.65d, Kata.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, Kata.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, Kata.fuelPrice(5, 5.6d), 0.001d);
    }
}
