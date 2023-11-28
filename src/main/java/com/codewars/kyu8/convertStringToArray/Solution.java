package com.codewars.kyu8.convertStringToArray;

/**
 * Write a function to split a string and convert it into an array of words.
 * <p>
 * Examples (Input ==> Output):<br/>
 * "Robin Singh" ==> ["Robin", "Singh"]<br/>
 * <p>
 * "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class Solution {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
