package com.codewars.kyu8.didSheSayHallo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KataTest {
    @Test
    void testSomething() {
        assertTrue(Kata.validateHello("hello"));
        assertTrue(Kata.validateHello("ciao bella!"));
        assertTrue(Kata.validateHello("salut"));
        assertTrue(Kata.validateHello("hallo, salut"));
        assertTrue(Kata.validateHello("hombre! Hola!"));
        assertTrue(Kata.validateHello("Hallo, wie geht\'s dir?"));
        assertTrue(Kata.validateHello("AHOJ!"));
        assertTrue(Kata.validateHello("czesc"));
        assertTrue(Kata.validateHello("Ahoj"));
        assertFalse(Kata.validateHello("meh"));
    }
}
