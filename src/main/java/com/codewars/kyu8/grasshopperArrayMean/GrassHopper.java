package com.codewars.kyu8.grasshopperArrayMean;

import java.util.Arrays;

public class GrassHopper {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).reduce(0, Integer::sum) / nums.length;
    }
}
