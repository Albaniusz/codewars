package com.codewars.kyu8.function.squaringAnArgument;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    void fixed_tests() {
        assertEquals(4, Kata.square(2));
        assertEquals(2500, Kata.square(50));
        assertEquals(1, Kata.square(1));
    }
}
