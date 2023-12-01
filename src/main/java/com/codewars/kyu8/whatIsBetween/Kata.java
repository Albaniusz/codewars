package com.codewars.kyu8.whatIsBetween;

import java.util.stream.IntStream;

/**
 * Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between
 * the input parameters, including them.
 * <p>
 * For example:
 * <p>
 * a = 1<br/>
 * b = 4<br/>
 * --> [1, 2, 3, 4]
 */
public class Kata {
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b).toArray();
    }
}
