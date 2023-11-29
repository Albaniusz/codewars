package com.codewars.kyu8.replaceAllDots;

/**
 * The code provided is supposed replace all the dots . in the specified String str with dashes -
 * <p>
 * But it's not working properly.
 * <p>
 * <h2>Task</h2>
 * Fix the bug so we can all go home early.
 * <p>
 * <h2>Notes</h2>
 * String str will never be null.
 */
public class Dinglemouse {
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}
