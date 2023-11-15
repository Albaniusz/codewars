package com.codewars.kyu8.wilsonPrimes;

import java.math.BigInteger;
import java.util.stream.LongStream;

/**
 * Wilson primes satisfy the following condition. Let P represent a prime number.
 * <p>
 * Then,
 * <p>
 * ((P-1)! + 1) / (P * P)
 * should give a whole number.
 * <p>
 * Your task is to create a function that returns true if the given number is a Wilson prime.
 */
public class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        if (n == 0) {
            return false;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        factorialHavingLargeResult(n - 1).add(BigInteger.ONE).divide(BigInteger.valueOf(Math.pow(n, 2));


        double number = LongStream.rangeClosed(1, (long) n - 1).reduce(1, (long x, long y) -> x * y) + 1 / Math.pow(n, 2);
        return number - (int) number > 0;
    }

    private BigInteger factorialHavingLargeResult(double n) {

        return result;
    }
}
