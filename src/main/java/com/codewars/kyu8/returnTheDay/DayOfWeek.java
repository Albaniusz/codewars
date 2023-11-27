package com.codewars.kyu8.returnTheDay;

import java.util.Arrays;
import java.util.List;

/**
 * Complete the function which returns the weekday according to the input number:
 * <p>
 * 1 returns "Sunday"<br/>
 * 2 returns "Monday"<br/>
 * 3 returns "Tuesday"<br/>
 * 4 returns "Wednesday"<br/>
 * 5 returns "Thursday"<br/>
 * 6 returns "Friday"<br/>
 * 7 returns "Saturday"<br/>
 * Otherwise returns "Wrong, please enter a number between 1 and 7"
 */
public class DayOfWeek {
    public static String getDay(int n) {
        List<String> days = Arrays.asList("Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday");

        return n - 1 >= 0 && n - 1 < days.size() ? days.get(n - 1) : "Wrong, please enter a number between 1 and 7";
    }
}
