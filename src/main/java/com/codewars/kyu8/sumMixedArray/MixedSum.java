package com.codewars.kyu8.sumMixedArray;

import java.util.List;

/**
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 * <p>
 * Return your answer as a number.
 */
public class MixedSum {

    /**
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream()
            .filter(item -> item.toString().matches("^\\d$"))
            .mapToInt(item -> Integer.parseInt(item.toString()))
            .sum();
    }
}
