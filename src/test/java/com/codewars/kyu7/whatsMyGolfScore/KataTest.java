package com.codewars.kyu7.whatsMyGolfScore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void exampleTest() {
        assertEquals(-1, Kata.golfScoreCalculator("443454444344544443", "353445334534445344"));
    }
}
