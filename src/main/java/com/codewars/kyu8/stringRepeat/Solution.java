package com.codewars.kyu8.stringRepeat;

/**
 * Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated
 * exactly n times.
 * <p>
 * Examples (input -> output)<br/>
 * 6, "I"     -> "IIIIII"<br/>
 * 5, "Hello" -> "HelloHelloHelloHelloHello"
 */
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
