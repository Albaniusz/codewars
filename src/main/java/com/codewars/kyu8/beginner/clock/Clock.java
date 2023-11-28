package com.codewars.kyu8.beginner.clock;

/**
 * Clock shows h hours, m minutes and s seconds after midnight.
 * <p>
 * Your task is to write a function which returns the time since midnight in milliseconds.
 * <p>
 * Example:<br/>
 * h = 0<br/>
 * m = 1<br/>
 * s = 1<br/>
 * <p>
 * result = 61000
 * <p>
 * Input constraints:
 * 0 <= h <= 23<br/>
 * 0 <= m <= 59<br/>
 * 0 <= s <= 59
 */
public class Clock {
    public static int Past(int h, int m, int s) {
        return ((h * 60 + m) * 60 + s) * 1000;
    }
}
