package com.codewars.kyu8.findSmallestIntegerInArray;

import java.util.Arrays;

/**
 * Given an array of integers your solution should find the smallest integer.
 * <p>
 * For example:
 * <p>
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * <p>
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
