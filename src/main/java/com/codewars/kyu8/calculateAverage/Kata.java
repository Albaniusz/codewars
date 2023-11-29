package com.codewars.kyu8.calculateAverage;

import static java.util.stream.IntStream.of;

/**
 * Write a function which calculates the average of the numbers in a given list.
 * <p>
 * Note: Empty arrays should return 0.
 */
public class Kata {
    public static double find_average(int[] array) {
        return of(array).average().getAsDouble();
    }
}
