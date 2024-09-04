package com.codewars.kyu7.helpYourFellowWarrior;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void sampleTestOfHonor() {
        assertEquals("2kyus: 1, 1kyus: 4", Kata.getHonorPath(2, 11));
        assertEquals("2kyus: 0, 1kyus: 4", Kata.getHonorPath(2, 10));
        assertEquals("2kyus: 1, 1kyus: 0", Kata.getHonorPath(2, 3));
        assertEquals("", Kata.getHonorPath(11, 2));
        assertEquals("", Kata.getHonorPath(11, 11));
    }
}
