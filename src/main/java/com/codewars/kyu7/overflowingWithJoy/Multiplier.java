package com.codewars.kyu7.overflowingWithJoy;

/**
 * Multiply two ints, but take care of overflow. If the result cannot be accurately stored in an int, throw an ArithmeticException.
 * <p>
 * (If this is too easy, try <a href="https://www.codewars.com/kata/overflowing-with-longing">overflowing with longing</a>.)
 */
public class Multiplier {
    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }
}
