package com.codewars.kyu8.grasshopper.summation;

/**
 * Summation<br/>
 * Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
 * <p>
 * For example (Input -> Output):
 * <p>
 * 2 -> 3 (1 + 2)<br/>
 * 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */
public class GrassHopper {
    public static int summation(int n) {
        int result = 0;

        while (n > 0) {
            result += n;
            n--;
        }

        return result;
    }
}
