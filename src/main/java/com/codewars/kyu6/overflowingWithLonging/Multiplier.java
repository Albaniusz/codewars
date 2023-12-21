package com.codewars.kyu6.overflowingWithLonging;

/**
 * Multiply two longs, but take care of overflow. If the result cannot be accurately stored in a long, throw an ArithmeticException.
 * <p>
 * (Because <a href="https://www.codewars.com/kata/overflowing-with-joy">overflowing with joy</a> is too easy.)
 */
public class Multiplier {
    public static long multiply(long a, long b) {
        return Math.multiplyExact(a, b);
    }
}
