package com.codewars.kyu8.noZerosForHeros;

/**
 * Numbers ending with zeros are boring.
 * <p>
 * They might be fun in your world, but not here.
 * <p>
 * Get rid of them. Only the ending ones.
 * <p>
 * 1450 -> 145<br/>
 * 960000 -> 96<br/>
 * 1050 -> 105<br/>
 * -1050 -> -105
 * <p>
 * Zero alone is fine, don't worry about it. Poor guy anyway
 */
public class NoBoring {
    public static int noBoringZeros(int n) {
        if (n == 0) {
            return 0;
        }

        while (n % 10 == 0) {
            n = n / 10;
        }

        return n;
    }
}
