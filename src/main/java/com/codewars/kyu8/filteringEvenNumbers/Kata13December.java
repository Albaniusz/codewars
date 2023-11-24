package com.codewars.kyu8.filteringEvenNumbers;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Fix the bug in Filtering method
 * <p>
 * The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.
 * <p>
 * However, there is a bug in the method that needs to be resolved.
 */
public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream()
            .filter(item -> item % 2 != 0)
            .collect(Collectors.toList());
    }
}
