package com.codewars.kyu8.multiplyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    void tests() {
        assertEquals(15, Kata.multiply(3), "For number = 3");
        assertEquals(250, Kata.multiply(10), "For number = 10");
        assertEquals(25000, Kata.multiply(200), "For number = 200");
        assertEquals(0, Kata.multiply(0), "For number = 0");
        assertEquals(-15, Kata.multiply(-3), "For number = -3");
    }
}
