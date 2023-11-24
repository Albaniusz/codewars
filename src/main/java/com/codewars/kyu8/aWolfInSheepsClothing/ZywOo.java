package com.codewars.kyu8.aWolfInSheepsClothing;

/**
 * Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend
 * to be sheep. Fortunately, you are good at spotting them.
 * <p>
 * Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of
 * the queue which is at the end of the array:
 * <p>
 * [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)<br/>
 * 7      6      5      4      3            2      1
 * <p>
 * If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return
 * "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
 * <p>
 * Note: there will always be exactly one wolf in the array.
 * <p>
 * Examples<br/>
 * Input: ["sheep", "sheep", "sheep", "wolf", "sheep"]<br/>
 * Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"
 * <p>
 * Input: ["sheep", "sheep", "wolf"]<br/>
 * Output: "Pls go away and stop eating my sheep"
 */
public class ZywOo {

    private static final String WOLF = "wolf";

    public static String warnTheSheep(String[] array) {
        if (WOLF.equals(array[array.length - 1])) {
            return "Pls go away and stop eating my sheep";
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (WOLF.equals(array[i])) {
                return String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", array.length - i - 1);
            }
        }

        return "";
    }
}
