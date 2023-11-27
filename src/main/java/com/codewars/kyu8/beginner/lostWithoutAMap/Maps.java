package com.codewars.kyu8.beginner.lostWithoutAMap;

import java.util.stream.IntStream;

/**
 * Given an array of integers, return a new array with each value doubled.
 * <p>
 * For example:
 * <p>
 * [1, 2, 3] --> [2, 4, 6]
 */
public class Maps {
    public static int[] map(int[] arr) {
        return IntStream.of(arr)
            .map(item -> item * 2)
            .toArray();
    }
}
