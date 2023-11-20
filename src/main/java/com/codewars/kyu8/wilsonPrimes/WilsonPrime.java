package com.codewars.kyu8.wilsonPrimes;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * Wilson primes satisfy the following condition. Let P represent a prime number.
 * <p>
 * Then, ((P-1)! + 1) / (P * P) should give a whole number.
 * <p>
 * Your task is to create a function that returns true if the given number is a Wilson prime.
 */
public class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        if (n < 2d) {
            return false;
        }
        return getFactorial((int) n - 1).add(BigInteger.ONE).remainder(BigInteger.valueOf((long) Math.pow(n, 2))).compareTo(BigInteger.ZERO) == 0;
    }

    public static BigInteger getFactorial(int f) {
        if (f < 2) {
            return BigInteger.valueOf(1);
        } else {
            return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }
}
