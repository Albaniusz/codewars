package com.codewars.kyu8.printingArrayElementsWithCommaDelimiters;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Input: Array of elements
 * <p>
 * ["h","o","l","a"]
 * <p>
 * Output: String with comma delimited elements of the array in th same order.
 * <p>
 * "h,o,l,a"
 * <p>
 * Note: if this seems too simple for you try the next level
 * <p>
 * Note2: the input data can be: boolean array, array of objects, array of string arrays, array of number arrays...
 */
public class ArrayPrinter {
    public static String printArray(Object[] array) {
        return Stream.of(array).map(String::valueOf).collect(Collectors.joining(","));
    }
}
