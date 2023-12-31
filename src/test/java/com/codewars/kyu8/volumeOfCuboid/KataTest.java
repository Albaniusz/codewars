package com.codewars.kyu8.volumeOfCuboid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    private static final double delta = 0.0001;

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, Kata.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, Kata.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}
