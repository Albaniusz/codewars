package com.codewars.kyu8.squareNSum;

import static java.util.stream.IntStream.of;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 * <p>
 * For example, for [1, 2, 2] it should return 9 because 1<sup>2</sup> + 2<sup>2</sup> + 2<sup>2</sup> = 9
 */
public class Kata {
    public static int squareSum(int[] n) {
        return of(n).map(i -> i * i).sum();
    }
}
