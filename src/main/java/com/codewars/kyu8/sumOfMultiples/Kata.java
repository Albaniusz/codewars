package com.codewars.kyu8.sumOfMultiples;

/**
 * <h2>Your Job</h2>
 * Find the sum of all multiples of n below m
 * <p>
 * <h2>Keep in Mind</h2>
 * n and m are natural numbers (positive integers)<br/>
 * m is excluded from the multiples
 * <p>
 * <h2>Examples</h2>
 * Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20<br/>
 * Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30<br/>
 * Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860<br/>
 * Kata.sumMul(4, -7)  // throws IllegalArgumentException
 */
public class Kata {
    public static long sumMul(int n, int m) {
        if (n < 1 || m < 1) {
            throw new IllegalArgumentException();
        }

        int result = 0;
        int i = 1;

        while (i * n < m) {
            result += i * n;
            i++;
        }

        return result;
    }
}
