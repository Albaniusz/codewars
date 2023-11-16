package com.codewars.kyu5.simplePigLatin;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * <p>
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\b[A-Za-z\\[\\]]{1})(\\w*)", "$2$1ay");
    }
}
