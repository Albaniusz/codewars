package com.codewars.kyu8.beginner.cockroach;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CockroachTest {
    @Test
    public void basicTests() throws Exception {
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}
