package com.codewars.kyu8.compareWithinMargin;

/**
 * Create a function close_compare that accepts 3 parameters: a, b, and an optional margin. The function should
 * return whether a is lower than, close to, or higher than b.
 * <p>
 * Please note the following:
 * <p>
 * When a is close to b, return 0.
 * For this challenge, a is considered "close to" b if margin is greater than or equal to the absolute distance
 * between a and b.
 * Otherwise...
 * <p>
 * When a is less than b, return -1.
 * <p>
 * When a is greater than b, return 1.
 * <p>
 * If margin is not given, treat it as if it were zero.
 */
public class Solution {
    public static int closeCompare(double a, double b) {
        return Double.compare(a, b);
    }

    public static int closeCompare(double a, double b, double margin) {
        return margin >= Math.abs(a - b) ? 0 : Double.compare(a, b);
    }
}
