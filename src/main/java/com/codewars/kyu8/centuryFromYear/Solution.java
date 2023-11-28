package com.codewars.kyu8.centuryFromYear;

/**
 * Introduction
 * <p>
 * The first century spans from the year 1 up to and including the year 100, the second century - from the year 101
 * up to and including the year 200, etc.
 * <p>
 * Task
 * <p>
 * Given a year, return the century it is in.
 * <p>
 * Examples
 * <p>
 * 1705 --> 18<br/>
 * 1900 --> 19<br/>
 * 1601 --> 17<br/>
 * 2000 --> 20
 * <p>
 * Note: this kata uses strict construction as shown in the description and the examples, you can read more about it <a href="https://en.wikipedia.org/wiki/Century">here</a>
 */
public class Solution {
    public static int century(int number) {
        return (number - 1) / 100 + 1;
    }
}
