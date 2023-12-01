package com.codewars.kyu8.arrayPlusArray;

import static java.util.stream.IntStream.of;

/**
 * I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements.
 * I'll appreciate for your help.
 * <p>
 * P.S. Each array includes only integer numbers. Output is a number too.
 */
public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return of(arr1).sum() + of(arr2).sum();
    }
}
