package com.codewars.kyu6.breakCamelCase;

import java.util.Arrays;

/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 * Example
 * <p>
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */
public class Solution {
    public static String camelCase(String input) {
        StringBuilder output = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (character >= 65 && character <= 90) {
                output.append(" ");
            }
            output.append(character);
        }

        return output.toString();
    }
}
