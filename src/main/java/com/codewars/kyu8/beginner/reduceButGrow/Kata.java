package com.codewars.kyu8.beginner.reduceButGrow;

import static java.util.stream.IntStream.of;

/**
 * Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
 * <p>
 * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */
public class Kata {
    public static int grow(int[] x) {
        return of(x).reduce(1, (a, b) -> a * b);
    }
}
