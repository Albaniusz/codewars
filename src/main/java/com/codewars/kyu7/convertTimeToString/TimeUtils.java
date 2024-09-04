package com.codewars.kyu7.convertTimeToString;

/**
 * Given time in seconds, return formatted string, as shown in following example:
 * <p>
 * Example:
 * <p>
 * Input: 90061 sec<br/>
 * Output: 1 1 1 1
 * <p>
 * e.g
 * <p>
 * 90061 sec: 1 1 1 1 (1 day, 1 hour, 1 min and 1 seconds)<br/>
 * 93784 sec: 1 2 3 4 (1 day, 2 hours, 3 mins, 4 seconds)
 * <p>
 * Useful conversions:
 * <ul>
 * <il>60 sec = 1 min</il>
 * <il>60 min = 1 hour</il>
 * <il>24 hour = 1 day</il>
 * </ul>
 * Please see included test case for an example.
 */
public class TimeUtils {
    public static String convertTime(int timeDiff) {
        int day = timeDiff / (60 * 60 * 24);
        int dayRest = timeDiff % (60 * 60 * 24);
        int hours = dayRest / (60 * 60);
        int hoursRest = dayRest % (60 * 60);
        int minutes = hoursRest / 60;
        int seconds = hoursRest % 60;

        return String.format("%d %d %d %d", day, hours, minutes, seconds);
    }
}
