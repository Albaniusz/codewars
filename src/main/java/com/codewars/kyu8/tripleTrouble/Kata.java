package com.codewars.kyu8.tripleTrouble;

/**
 * <h2>Triple Trouble</h2>
 * Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
 * Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter,
 * see example below!
 * <p>
 * E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
 * <p>
 * Note: You can expect all of the inputs to be the same length.
 */
public class Kata {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < one.length(); i++) {
            stringBuilder.append(one.charAt(i));
            stringBuilder.append(two.charAt(i));
            stringBuilder.append(three.charAt(i));
        }

        return stringBuilder.toString();
    }
}
