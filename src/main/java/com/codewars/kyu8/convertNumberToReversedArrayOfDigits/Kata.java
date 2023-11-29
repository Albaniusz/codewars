package com.codewars.kyu8.convertNumberToReversedArrayOfDigits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Convert number to reversed array of digits</h2>
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 * <p>
 * Example(Input => Output):<br/>
 * 35231 => [1,3,2,5,3]<br/>
 * 0 => [0]
 */
public class Kata {
    public static int[] digitize(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        int[] results = new int[chars.length];

        for (int i = chars.length - 1; i >= 0; i--) {
            results[results.length - i - 1] = Integer.parseInt(String.valueOf(chars[i]));
        }

        return results;
    }
}
