package com.codewars.kyu8.removeDuplicatesFromList;

import java.util.stream.IntStream;

/**
 * Define a function that removes duplicates from an array of non negative numbers and returns it as a result.
 * <p>
 * The order of the sequence has to stay the same.
 * <p>
 * Examples:
 * <pre>
 * Input -> Output
 * [1, 1, 2] -> [1, 2]
 * [1, 2, 1, 1, 3, 2] -> [1, 2, 3]
 * </pre>
 */
public class Solution {
    public static int[] distinct(int[] array) {
        return IntStream.of(array)
            .distinct()
            .toArray();
    }
}
