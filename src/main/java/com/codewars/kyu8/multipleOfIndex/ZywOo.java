package com.codewars.kyu8.multipleOfIndex;

/**
 * Return a new array consisting of elements which are multiple of their own index in input array (length > 1).
 * <p>
 * Some cases:<br/>
 * [22, -6, 32, 82, 9, 25] =>  [-6, 32, 25]<br/>
 * [68, -1, 1, -7, 10, 10] => [-1, 10]<br/>
 * [-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68] => [-85, 72, 0, 68]
 */
public class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (isMultiple(i, array[i])) {
                counter++;
            }
        }

        int[] result = new int[counter];

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isMultiple(i, array[i])) {
                result[counter] = array[i];
                counter++;
            }
        }

        return result;
    }

    private static boolean isMultiple(int index, int number) {
        return index == 0 ? number == 0 : number % index == 0;
    }
}
