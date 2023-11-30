package com.codewars.kyu8.beConcise.indexOfElementInArray;

import java.util.Arrays;

/**
 * <h2>Be Concise IV - Index of an element in an array</h2>
 * <h2>Task</h2>
 * Provided is a function Kata which accepts two parameters in the following order: array, element and returns
 * the index of the element if found and "Not found" otherwise. Your task is to shorten the code as much as possible
 * in order to meet the strict character count requirements of the Kata. (no more than 161) You may assume that all
 * array elements are unique.
 */
public class Solution {
    public static String kata(String[] a, String s) {
        int r = Arrays.asList(a).indexOf(s);
        return r < 0 ? "Not found" : "" + r;
    }
}
