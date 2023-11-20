package com.codewars.kyu8.aNeedleInTheHaystack;

/**
 * Can you find the needle in the haystack?
 * <p>
 * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 * After your function finds the needle it should return a message (as a string) that says:
 * "found the needle at position " plus the index it found the needle, so:
 * <p>
 * Example(Input --> Output)
 * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
 */
public class Kata {

    private static final String message = "found the needle at position %d";

    private static final String needle = "needle";

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (needle.equals(haystack[i])) {
                return String.format(message, i);
            }
        }

        return null;
    }
}
