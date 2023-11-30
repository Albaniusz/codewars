package com.codewars.kyu8.vowelRemover;

/**
 * Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
 * <p>
 * Examples<br/>
 * "hello"     -->  "hll"<br/>
 * "codewars"  -->  "cdwrs"<br/>
 * "goodbye"   -->  "gdby"<br/>
 * "HELLO"     -->  "HELLO"
 * <p>
 * don't worry about uppercase vowels<br/>
 * y is not considered a vowel for this kata
 */
public class Kata {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
