package com.codewars.kyu8.removeTheTime;

/**
 * Task Description
 * <p>
 * You're re-designing a blog, and the blog's posts have the Weekday Month Day, time format for showing the date
 * and time when a post was made, e.g., Friday May 2, 7pm.
 * <p>
 * You're running out of screen real estate, and on some pages you want to display a shorter format, Weekday Month
 * Day that omits the time.
 * <p>
 * Write a function that takes the website date/time in its original string format and returns the shortened format.
 * <p>
 * Input
 * <p>
 * Input will always be a string, e.g., "Friday May 2, 7pm".
 * <p>
 * Output
 * <p>
 * Output will be the shortened string, e.g., "Friday May 2".
 */
public class Solution {
    public static String shortenToDate(String longDate) {
        return longDate.substring(0, longDate.indexOf(','));
    }
}
