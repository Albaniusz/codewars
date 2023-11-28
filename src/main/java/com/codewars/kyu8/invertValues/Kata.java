package com.codewars.kyu8.invertValues;

import static java.util.stream.IntStream.of;

/**
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives
 * become positives.
 * <p>
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]<br/>
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]<br/>
 * invert([]) == []
 */
public class Kata {
    public static int[] invert(int[] array) {
        return of(array).map(i -> -1 * i).toArray();
    }
}
