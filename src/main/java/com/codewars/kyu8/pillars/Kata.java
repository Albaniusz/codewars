package com.codewars.kyu8.pillars;

/**
 * There are pillars near the road. The distance between the pillars is the same and the width of the pillars is
 * the same. Your function accepts three arguments:
 * <p>
 * number of pillars (≥ 1);<br/>
 * distance between pillars (10 - 30 meters);<br/>
 * width of the pillar (10 - 50 centimeters).<br/>
 * Calculate the distance between the first and the last pillar in centimeters (without the width of the first
 * and last pillar).
 */
public class Kata {
    public static int pillars(int numPill, int dist, int width) {
        if (numPill < 2) {
            return 0;
        }

        return (numPill - 1) * (dist * 100) + (width * (numPill - 2));
    }
}
