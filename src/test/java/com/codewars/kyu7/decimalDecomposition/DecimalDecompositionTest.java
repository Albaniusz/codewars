package com.codewars.kyu7.decimalDecomposition;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DecimalDecompositionTest {
    @Test
    void testA() {
        assertEquals(DecimalDecomposition.decimalDecomposition(123), "100+20+3");
    }

    @Test
    void testB() {
        assertEquals(DecimalDecomposition.decimalDecomposition(100), "100");
    }

    @Test
    void testC() {
        assertEquals(DecimalDecomposition.decimalDecomposition(50906), "50000+900+6");
    }
}
