package com.codewars.kyu8.makeUpperCase;

/**
 * Write a function which converts the input string to uppercase.
 */
public class Upper {
    public static String MakeUpperCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int shift = chars[i] > 96 && chars[i] < 123 ? 32 : 0;
            chars[i] = (char) (chars[i] - shift);
        }

        return String.valueOf(chars);
    }
}

