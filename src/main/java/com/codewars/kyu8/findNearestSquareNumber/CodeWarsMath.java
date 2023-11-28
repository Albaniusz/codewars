package com.codewars.kyu8.findNearestSquareNumber;

/**
 * Your task is to find the nearest square number, nearest_sq(n) or nearestSq(n), of a positive integer n.
 * <p>
 * For example, if n = 111, then nearest\_sq(n) (nearestSq(n)) equals 121, since 111 is closer to 121, the square of 11,
 * than 100, the square of 10.
 * <p>
 * If the n is already the perfect square (e.g. n = 144, n = 81, etc.), you need to just return n.
 * <p>
 * Good luck :)
 */
public class CodeWarsMath {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}
