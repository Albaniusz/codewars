package com.codewars.kyu8.findThePosition;

/**
 * When provided with a letter, return its position in the alphabet.
 * <p>
 * Input :: "a"
 * <p>
 * Ouput :: "Position of alphabet: 1"
 */
public class Kata {
    public static String position(char alphabet) {
        return "Position of alphabet: " + (alphabet - 96);
    }
}
