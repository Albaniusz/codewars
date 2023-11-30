package com.codewars.kyu8.countOfPositivesSumOfnegatives;

/**
 * Given an array of integers.
 * <p>
 * Return an array, where the first element is the count of positives numbers and the second element is sum
 * of negative numbers. 0 is neither positive nor negative.
 * <p>
 * If the input is an empty array or is null, return an empty array.
 * <p>
 * Example<br/>
 * For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */
public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[]{0, 0};

        if (input != null && input.length > 0) {
            for (int i : input) {
                if (i > 0) {
                    result[0]++;
                } else if (i < 0) {
                    result[1] += i;
                }
            }
        } else {
            return new int[]{};
        }

        return result;
    }
}
