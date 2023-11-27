package com.codewars.kyu8.ifYouCantSleepJustCountSheep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void testSomething() {
        assertEquals("", Kata.countingSheep(0));
        assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
    }
}
