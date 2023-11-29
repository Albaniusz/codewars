package com.codewars.kyu8.larioAndMuigiPipeProblem;

import java.util.stream.IntStream;

/**
 * <h2>Issue</h2>
 * Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
 * <p>
 * The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
 * <p>
 * The pipes are correct when each pipe after the first is 1 more than the previous one.
 * <p>
 * <h2>Task</h2>
 * Given a list of unique numbers sorted in ascending order, return a new list so that the values increment
 * by 1 for each index from the minimum value up to the maximum value (both included).
 * <p>
 * <h2>Example</h2>
 * Input:  1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8
 */
public class Kata {
    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
