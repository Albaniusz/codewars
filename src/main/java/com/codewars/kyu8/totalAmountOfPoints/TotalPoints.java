package com.codewars.kyu8.totalAmountOfPoints;

import java.util.Arrays;

/**
 * Our football team has finished the championship.
 * <p>
 * Our team's match results are recorded in a collection of strings. Each match is represented by a string
 * in the format "x:y", where x is our team's score and y is our opponents score.
 * <p>
 * For example: ["3:1", "2:2", "0:1", ...]
 * <p>
 * Points are awarded for each match as follows:
 * <p>
 * if x > y: 3 points (win)<br/>
 * if x < y: 0 points (loss)<br/>
 * if x = y: 1 point (tie)
 * <p>
 * We need to write a function that takes this collection and returns the number of points our team (x) got
 * in the championship by the rules given above.
 * <p>
 * Notes:
 * <p>
 * our team always plays 10 matches in the championship<br/>
 * 0 <= x <= 4<br/>
 * 0 <= y <= 4
 */
public class TotalPoints {
    public static int points(String[] games) {
        return Arrays.stream(games)
            .map(item -> {
                String[] game = item.split(":");

                int x = Integer.parseInt(game[0]);
                int y = Integer.parseInt(game[1]);

                return x > y ? 3 : x < y ? 0 : 1;
            })
            .reduce(0, Integer::sum);
    }
}
