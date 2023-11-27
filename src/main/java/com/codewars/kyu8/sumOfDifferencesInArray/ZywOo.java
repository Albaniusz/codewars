package com.codewars.kyu8.sumOfDifferencesInArray;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Your task is to sum the differences between consecutive pairs in the array in descending order.
 * <p>
 * Example
 * <p>
 * [2, 1, 10]  -->  9<br/>
 * In descending order: [10, 2, 1]
 * <p>
 * Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
 * <p>
 * If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell, None in Rust).
 */
public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }

        int counter = 0;
        List<Integer> elements = IntStream.of(arr).boxed().sorted(Collections.reverseOrder()).toList();

        for (int i = 1; i < elements.size(); i++) {
            counter += elements.get(i - 1) - elements.get(i);
        }

        return counter;
    }
}
