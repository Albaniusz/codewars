package com.codewars.kyu7.whatsMyGolfScore;

/**
 * I have the par value for each hole on a golf course and my stroke score on each hole. I have them stored as strings, because I wrote them down on a sheet of paper. Right now, I'm using those strings to calculate my golf score by hand: take the difference between my actual score and the par of the hole, and add up the results for all 18 holes.
 * <p>
 * For example:
 * <ul>
 * <li>If I took 7 shots on a hole where the par was 5, my score would be: 7 - 5 = 2</li>
 * <li>If I got a hole-in-one where the par was 4, my score would be: 1 - 4 = -3.</li>
 * <li>Doing all this math by hand is really hard! Can you help make my life easier?</li>
 * </ul>
 * <h3>Task Overview</h3>
 * Complete the function which accepts two strings and calculates the golf score of a game. Both strings will be of length 18, and each character in the string will be a number between 1 and 9 inclusive.
 */
public class Kata {
    public static int golfScoreCalculator(String parList, String scoreList) {
        int result = 0;

        char[] scores = scoreList.toCharArray();
        char[] pars = parList.toCharArray();

        for (int i = 0; i < scores.length; i++) {
            result += Integer.parseInt(Character.toString(scores[i])) - Integer.parseInt(Character.toString(pars[i]));
        }

        return result;
    }
}
