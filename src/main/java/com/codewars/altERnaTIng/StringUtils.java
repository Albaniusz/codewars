package com.codewars.altERnaTIng;

public class StringUtils {
    public static String toAlternativeString(String string) {
        StringBuilder result = new StringBuilder();

        for (char ch : string.toCharArray()) {
            int value = ch;

            if ((value >= 65 && value <= 90 ) || (value >= 97 && value <= 122)) {
                value += value <= 90 ? 32 : -32;
            }

            result.append((char) value);
        }

        return result.toString();
    }
}
