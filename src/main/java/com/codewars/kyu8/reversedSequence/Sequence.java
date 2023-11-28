package com.codewars.kyu8.reversedSequence;

import java.util.stream.IntStream;

/**
 * Build a function that returns an array of integers from n to 1 where n>0.
 * <p>
 * Example : n=5 --> [5,4,3,2,1]
 */
public class Sequence {
    public static int[] reverse(int n) {
        return IntStream.rangeClosed(1, n).map(i -> 1 - i + n).toArray();
    }
}
