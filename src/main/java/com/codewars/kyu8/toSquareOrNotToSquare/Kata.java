package com.codewars.kyu8.toSquareOrNotToSquare;

public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            array[i] = (int) (Math.sqrt(value) - (int) Math.sqrt(value) > 0 ? Math.pow(value, 2.0) : Math.sqrt(value));
        }

        return array;
    }
}
