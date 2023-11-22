package com.codewars.kyu8.exclamationMarksSeries.replaceAllVowelToExclamationMarkInTheSentence;

/**
 * Description:
 * <p>
 * Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
 * <p>
 * Examples
 * replace("Hi!") === "H!!"<br/>
 * replace("!Hi! Hi!") === "!H!! H!!"<br/>
 * replace("aeiou") === "!!!!!"<br/>
 * replace("ABCDE") === "!BCD!"
 */
public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}
