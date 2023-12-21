package com.codewars.kyu7.alternateSquareSum;

import java.util.stream.IntStream;

/**
 * Complete the function that takes an array of integers as input and finds the sum of squares of the elements
 * at even positions (i.e. 2nd, 4th, etc.) plus the sum of the rest of the elements at odd position.
 * <p>
 * For empty arrays, result should be zero (except for Haskell).
 * <p>
 * Note
 * <p>
 * The values at even positions need to be squared. For a language with zero-based indices, this will occur
 * at oddly-indexed locations. For instance, in Python, the values at indices 1, 3, 5, etc. should be squared
 * because these are the second, fourth, and sixth positions in the list.
 * <p>
 * Example
 * <p>
 * [11, 12, 13, 14, 15]  -->  379<br/>
 * # 1.  2.  3.  4.  5.  position
 * <p>
 * 11 + 12<sup>2</sup> + 13 + 14<sup>2</sup> + 15 = 379
 * <p>
 * Explanation:
 * <p>
 * Elements at indices 0, 2, 4 are 11, 13, 15 and they are at odd positions as 11 is at position #1, 13 is at position #3 and 15 at #5.
 * <p>
 * Elements at indices 1, 3 are 12 and 14 and they are at even position. So we need to add 11, 13, 15 as they are and square of 12 and 14
 */
public class Kata {
    public static int alternateSqSum(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }

        return IntStream.rangeClosed(0, arr.length - 1)
            .map(i -> i % 2 == 0 ? arr[i] : arr[i] * arr[i])
            .sum();
    }
}
