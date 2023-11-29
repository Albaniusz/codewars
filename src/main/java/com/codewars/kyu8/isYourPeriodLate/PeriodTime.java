package com.codewars.kyu8.isYourPeriodLate;

import java.time.LocalDate;

/**
 * In this kata, we will make a function to test whether a period is late.
 * <p>
 * Our function will take three parameters:
 * <p>
 * last - The Date object with the date of the last period
 * <p>
 * today - The Date object with the date of the check
 * <p>
 * cycleLength - Integer representing the length of the cycle in days
 * <p>
 * Return true if the number of days passed from last to today is greater than cycleLength. Otherwise, return false.
 */
public class PeriodTime {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return last.plusDays(cycleLength).isBefore(today);
    }
}
