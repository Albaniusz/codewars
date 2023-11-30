package com.codewars.kyu8.sumOfPositive;

import static java.util.stream.IntStream.of;

/**
 * You get an array of numbers, return the sum of all of the positives ones.
 * <p>
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * <p>
 * Note: if there is nothing to sum, the sum is default to 0.
 */
public class Positive {
    public static int sum(int[] arr) {
        return of(arr).filter(i -> i > 0).sum();
    }
}
