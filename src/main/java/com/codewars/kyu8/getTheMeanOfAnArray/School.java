package com.codewars.kyu8.getTheMeanOfAnArray;

import java.util.stream.IntStream;

/**
 * It's the academic year's end, fateful moment of your school report. The averages must be calculated. All
 * the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.
 * <p>
 * Return the average of the given array rounded down to its nearest integer.
 * <p>
 * The array will never be empty.
 */
public class School {
    public static int getAverage(int[] marks) {
        return IntStream.of(marks).sum() / marks.length;
    }
}
