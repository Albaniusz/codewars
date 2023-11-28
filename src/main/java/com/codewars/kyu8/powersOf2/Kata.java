package com.codewars.kyu8.powersOf2;

import java.util.stream.LongStream;

/**
 * Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with
 * the exponent ranging from 0 to n ( inclusive ).
 * <p>
 * Examples
 * <p>
 * n = 0  ==> [1]        # [2^0]<br/>
 * n = 1  ==> [1, 2]     # [2^0, 2^1]<br/>
 * n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
 */
public class Kata {
    public static long[] powersOfTwo(int n) {
        return LongStream.rangeClosed(0, n)
            .map(i -> (long) Math.pow(2, i))
            .toArray();
    }
}
