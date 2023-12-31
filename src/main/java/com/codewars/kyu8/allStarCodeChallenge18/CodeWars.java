package com.codewars.kyu8.allStarCodeChallenge18;

/**
 * Create a function that accepts a string and a single character, and returns an integer of the count of occurrences
 * the 2nd argument is found in the first one.
 * <p>
 * If no occurrences can be found, a count of 0 should be returned.
 * <p>
 * ("Hello", "o")  ==>  1<br/>
 * ("Hello", "l")  ==>  2<br/>
 * ("", "z")       ==>  0<br/>
 * str_count("Hello", 'o'); // returns 1<br/>
 * str_count("Hello", 'l'); // returns 2<br/>
 * str_count("", 'z'); // returns 0
 * <p>
 * Notes
 * <p>
 * The first argument can be an empty string<br/>
 * In languages with no distinct character data type, the second argument will be a string of length 1
 */
public class CodeWars {
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(ch -> ch == letter).count();
    }
}
