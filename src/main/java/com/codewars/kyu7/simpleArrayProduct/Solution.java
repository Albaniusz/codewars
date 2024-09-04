package com.codewars.kyu7.simpleArrayProduct;

import java.util.Objects;

/**
 * In this Kata, you will be given a multi-dimensional array containing 2 or more sub-arrays of integers. Your task
 * is to find the maximum product that can be formed by taking any one element from each sub-array.
 * <p>
 * Examples:
 * <p>
 * solve( [[1, 2],[3, 4]] ) = 8. The max product is given by 2 * 4<br/>
 * solve( [[10,-15],[-1,-3]] ) = 45, given by (-15) * (-3)<br/>
 * solve( [[1,-1],[2,3],[10,-100]] ) = 300, given by (-1) * 3 * (-100)
 * <p>
 * More examples in test cases. Good luck!
 */
public class Solution {
    public static int solve(int[][] matrix) {
        Integer max = null;
        int result = 1;
        for (int[] array : matrix) {
            for (int i : array) {
                result *= i;
                if (Objects.isNull(max)) {
                    max = result;
                } else {
                    if (result > max) {
                        max = result;
                    }
                }
            }
        }

        return result;
    }
}
