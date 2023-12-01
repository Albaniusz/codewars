package com.codewars.kyu8.fakeBinary;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
 * Return the resulting string.
 * <p>
 * Note: input will never be an empty string
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char chr : numberString.toCharArray()) {
            stringBuilder.append(chr < 53 ? "0" : 1);
        }

        return stringBuilder.toString();
    }
}
