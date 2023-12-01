package com.codewars.kyu8.differenceOfVolumesOfCuboids;

import static java.util.stream.IntStream.of;

/**
 * In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will
 * consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find
 * the difference of the cuboids' volumes regardless of which is bigger.
 * <p>
 * For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20.
 * Therefore, the function should return 8.
 * <p>
 * Your function will be tested with pre-made examples as well as random ones.
 * <p>
 * If you can, try writing it in one line of code.
 */
public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(of(firstCuboid).reduce((a, b) -> (a * b)).getAsInt() - of(secondCuboid).reduce((a, b) -> (a * b)).getAsInt());
    }
}
