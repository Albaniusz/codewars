package com.codewars.kyu8.csvRepresentationOfArray;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create a function that returns the CSV representation of a two-dimensional numeric array.
 * <p>
 * Example:
 * <p>
 * input:
 * <pre>
 *    [[ 0, 1, 2, 3, 4 ],
 *     [ 10,11,12,13,14 ],
 *     [ 20,21,22,23,24 ],
 *     [ 30,31,32,33,34 ]]
 * </pre>
 * output:
 * <pre>
 *      '0,1,2,3,4\n'
 *     +'10,11,12,13,14\n'
 *     +'20,21,22,23,24\n'
 *     +'30,31,32,33,34'
 *     </pre>
 */
public class Kata {
    public static String toCsvText(int[][] array) {
        return Arrays.stream(array)
            .map(item -> IntStream.of(item).mapToObj(String::valueOf).collect(Collectors.joining(",")))
            .collect(Collectors.joining("\n"));
    }
}
