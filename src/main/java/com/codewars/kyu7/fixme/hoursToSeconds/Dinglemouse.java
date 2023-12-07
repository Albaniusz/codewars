package com.codewars.kyu7.fixme.hoursToSeconds;

/**
 * The code provided is meant to return how many seconds there are in a given number of hours.
 * <p>
 * But it's not working properly.
 * <p>
 * Task
 * <p>
 * Fix the bug so we can all go home early.
 * <p>
 * Notes
 * <p>
 * The hours passed will be in the range 0 - 1000000
 */
public class Dinglemouse {
    public static long hoursToSeconds(final int hours) {
        return (long) hours * 60 * 60;
    }
}
