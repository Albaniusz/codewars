package com.codewars.kyu8.mergingSortedIntegerArraysWithoutDuplicates;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.of;

/**
 * Write a function that merges two sorted arrays into a single one. The arrays only contain integers. Also, the final
 * outcome must be sorted and not have any duplicate.
 */
public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(of(first), of(second))
            .distinct()
            .sorted()
            .toArray();
    }
}
