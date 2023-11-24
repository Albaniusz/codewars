package com.codewars.kyu8.countByX;

import java.util.stream.Stream;

/**
 * Create a function with two arguments that will return an array of the first n multiples of x.
 * <p>
 * Assume both the given number and the number of times to count will be positive numbers greater than 0.
 * <p>
 * Return the results as an array or list ( depending on language ).
 * <p>
 * Examples<br/>
 * countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}<br/>
 * countBy(2,5)  // should return {2,4,6,8,10}
 */
public class Kata {
    public static int[] countBy(int x, int n) {
        return Stream.iterate(x, i -> i + x)
            .limit(n)
            .mapToInt(i -> i)
            .toArray();
    }
}
