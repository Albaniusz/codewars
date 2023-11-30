package com.codewars.kyu8.sortAndStar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values
 * of the chars) and then return the first value.
 * <p>
 * The returned value must be a string, and have "***" between each of its letters.
 * <p>
 * You should not remove or add elements from/to the array.
 */
public class SortAndStar {
    public static String twoSort(String[] s) {
        List<String> sorted = Arrays.stream(s)
            .sorted()
            .toList();

        List<String> result = new ArrayList<>();
        for (char chr : sorted.get(0).toCharArray()) {
            result.add(String.valueOf(chr));
        }

        return String.join("***", result);
    }
}
