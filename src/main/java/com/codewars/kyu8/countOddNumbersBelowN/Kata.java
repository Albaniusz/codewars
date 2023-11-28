package com.codewars.kyu8.countOddNumbersBelowN;

/**
 * Given a number n, return the number of positive odd numbers below n, EASY!
 * <p>
 * Examples (Input -> Output)<br/>
 * 7  -> 3 (because odd numbers below 7 are [1, 3, 5])<br/>
 * 15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
 * <p>
 * Expect large Inputs!
 */
public class Kata {
    public static int oddCount(int n) {
        return n / 2;
    }
}
