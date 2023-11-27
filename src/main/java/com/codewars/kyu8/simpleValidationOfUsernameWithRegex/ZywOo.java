package com.codewars.kyu8.simpleValidationOfUsernameWithRegex;

import java.util.regex.Pattern;

/**
 * Write a simple regex to validate a username. Allowed characters are:
 * <p>
 * lowercase letters,<br/>
 * numbers,<br/>
 * underscore
 * <p>
 * Length should be between 4 and 16 characters (both included).
 */
public class ZywOo {
    public static boolean validateUsr(String s) {
        return Pattern.compile("^([a-z0-9_]){4,16}$").matcher(s).find();
    }
}
