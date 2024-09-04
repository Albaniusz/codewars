package com.codewars.kyu7.simpleFibonacciStrings;

/**
 * Given that
 * <p>
 * f0 = '0'<br/>
 * f1 = '01'<br/>
 * f2 = '010' = f1 + f0<br/>
 * f3 = '01001' = f2 + f1<br/>
 * <p>
 * You will be given a number and your task is to return the nth fibonacci string. For example:
 * <p>
 * solve(2) = '010'<br/>
 * solve(3) = '01001'
 * <p>
 * More examples in test cases. Good luck!
 * <p>
 * If you like sequence Katas, you will enjoy this Kata: <a href="https://www.codewars.com/kata/5a908da30025e995880000e3">Simple Prime Streaming</a>
 */
public class Solution {
    private static int limit;

    public static String solve(int n) {
        String f0 = "0";
        String f1 = "01";

        limit = n;

        if (n < 1) {
            return f0;
        } else if (n < 2) {
            return f1;
        } else {
            return doFibonacci(f1, f0, 2);
        }
    }

    private static String doFibonacci(String last, String beforeLast, int counter) {
        String current = last + beforeLast;
        return counter < limit ? doFibonacci(current, last, ++counter) : current;
    }
}
