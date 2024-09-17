package com.codewars.kyu8.shortLongShort;

/**
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside
 * and the longer string on the inside. The strings will not be the same length, but they may be empty ( zero length ).
 * <p>
 * Hint for R users:
 * <p>
 * The length of string is not always the same as the number of characters
 * <p>
 * For example: (Input1, Input2) --> output
 * <pre>
 * ("1", "22") --> "1221"
 * ("22", "1") --> "1221"
 *
 * ShortLongShort.solution("1", "22"); // returns "1221"
 * ShortLongShort.solution("22", "1"); // returns "1221"
 * </pre>
 */
public class ShortLongShort {
    public static String solution(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }
}
