package com.codewars.kyu8.stringyStrings;

/**
 * write me a function stringy that takes a size and returns a string of alternating 1s and 0s.
 * <p>
 * the string should start with a 1.
 * <p>
 * a string with size 6 should return :'101010'.
 * <p>
 * with size 4 should return : '1010'.
 * <p>
 * with size 12 should return : '101010101010'.
 * <p>
 * The size will always be positive and will only use whole numbers.
 */
public class Kata {
    public static String stringy(int size) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            stringBuilder.append(i % 2 == 0 ? "0" : "1");
        }

        return stringBuilder.toString();
    }
}
