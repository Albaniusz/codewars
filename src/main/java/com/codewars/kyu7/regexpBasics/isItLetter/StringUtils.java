package com.codewars.kyu7.regexpBasics.isItLetter;

/**
 * Complete the code which should return true if the given object is a single ASCII letter (lower or upper case),
 * false otherwise.
 */
public class StringUtils {
    public static boolean isLetter(String s) {
        return s.matches("^([a-zA-Z]){1}$");
    }
}
