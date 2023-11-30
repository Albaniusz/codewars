package com.codewars.kyu8.howGoodAreYouReally;

/**
 * There was a test in your class and you passed it. Congratulations!
 * <p>
 * But you're an ambitious person. You want to know if you're better than the average student in your class.
 * <p>
 * You receive an array with your peers' test scores. Now calculate the average and compare your score!
 * <p>
 * Return True if you're better, else False!
 * <p>
 * Note:
 * <p>
 * Your points are not included in the array of your class's points. For calculating the average point you may add your
 * point to the given array!
 */
public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;

        for (int point : classPoints) {
            sum += point;
        }

        return sum / classPoints.length < yourPoints;
    }
}
