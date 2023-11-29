package com.codewars.kyu8.removingElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Take an array and remove every second element from the array. Always keep the first element and start removing
 * with the next element.
 * <p>
 * <h2>Example:</h2>
 * ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
 * <p>
 * None of the arrays will be empty, so you don't have to worry about that!
 */
public class Kata {
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> results = new ArrayList<>();
        int guard = 0;

        for (Object ob : arr) {
            if (guard == 0) {
                results.add(ob);
            }

            guard += (guard == 0 ? 1 : -1);
        }

        return results.toArray();
    }
}
