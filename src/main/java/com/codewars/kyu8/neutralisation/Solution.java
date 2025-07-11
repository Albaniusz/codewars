package com.codewars.kyu8.neutralisation;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given two strings comprised of + and -, return a new string which shows how the two strings interact in the following way:
 * <p>
 * When positives and positives interact, they remain positive.
 * When negatives and negatives interact, they remain negative.
 * But when negatives and positives interact, they become neutral, and are shown as the number 0.
 * Worked Example
 * <pre>
 * ("+-+", "+--") ➞ "+-0"
 * # Compare the first characters of each string, then the next in turn.
 * # "+" against a "+" returns another "+".
 * # "-" against a "-" returns another "-".
 * # "+" against a "-" returns "0".
 * # Return the string of characters.
 * </pre>
 * Examples
 * <pre>
 * ("--++--", "++--++") ➞ "000000"
 *
 * ("-+-+-+", "-+-+-+") ➞ "-+-+-+"
 *
 * ("-++-", "-+-+") ➞ "-+00"
 * </pre>
 * Notes
 * The two strings will be the same length.
 */
public class Solution {
    public static String neutralise(String s1, String s2) {
        return IntStream.rangeClosed(0, s1.length() - 1)
            .mapToObj(i -> s1.charAt(i) == s2.charAt(i) ? "" + s1.charAt(i) : "0")
            .collect(Collectors.joining(""));
    }
}
