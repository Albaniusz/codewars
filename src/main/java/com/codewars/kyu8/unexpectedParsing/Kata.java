package com.codewars.kyu8.unexpectedParsing;

import java.util.HashMap;

/**
 * Expected Behaviour
 * <p>
 * Function should return a dictionary/Object/Hash with "status" as a key, whose value can : "busy" or "available"
 * depending on the truth value of the argument is_busy.
 * <p>
 * But as you will see after clicking RUN or ATTEMPT this code has several bugs, please fix them.
 */
public class Kata {
    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }
}
