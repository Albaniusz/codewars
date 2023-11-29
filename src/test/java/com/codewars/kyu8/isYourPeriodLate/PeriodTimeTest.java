package com.codewars.kyu8.isYourPeriodLate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeriodTimeTest {
    private static void doTest(LocalDate last, LocalDate today, int cycleLength, boolean expected) {
        boolean actual = PeriodTime.periodIsLate(last, today, cycleLength);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String l = last.format(formatter);
        String t = today.format(formatter);
        String testDescription = "Testing where last = " + l + " and today = " + t;
        assertEquals(actual, expected, testDescription);
    }

    @Test
    void testSomething() {
        doTest(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35, false);
        doTest(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28, true);
    }
}
