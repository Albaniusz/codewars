package com.codewars.kyu8.usdCny;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    private static void doTest(int usd, String expected) {
        assertEquals(expected, Kata.usdcny(usd), "Incorrect answer for usd = " + usd + "\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(15, "101.25 Chinese Yuan");
        doTest(465, "3138.75 Chinese Yuan");
        doTest(100, "675.00 Chinese Yuan");
        doTest(8470, "57172.50 Chinese Yuan");
    }
}
