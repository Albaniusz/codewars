package com.codewars.kyu7.the80sKids.helpALFFindHisSpaceship;

/**
 * Late last night in the Tanner household, ALF was repairing his spaceship so he might get back to Melmac.
 * Unfortunately for him, he forgot to put on the parking brake, and the spaceship took off during repair. Now
 * it's hovering in space.
 * <p>
 * ALF has the technology to bring the spaceship home if he can lock on to its location.
 * <p>
 * Given a map:
 * <ul>
 * <li>..........</li>
 * <li>..........</li>
 * <li>..........</li>
 * <li>.......X..</li>
 * <li>..........</li>
 * <li>..........</li>
 * </ul>
 * The map will be given in the form of a string with \n separating new lines. The bottom left of the map is [0, 0].
 * X is ALF's spaceship.
 * <p>
 * In this example:
 * <p>
 * findSpaceship(map) => "[7, 2]"
 * <p>
 * If you cannot find the spaceship, the result should be
 * <p>
 * "Spaceship lost forever."
 * <p>
 * Can you help ALF?
 */
public class EightiesKids2 {

    private final static String NOT_FOUND_MESSAGE = "Spaceship lost forever.";

    public static String findSpaceship(String map) {
        String[] rows = map.split("\n");

        int x, y = rows.length;

        for (String row : rows) {
            x = row.lastIndexOf("X");
            --y;

            if (x > -1) {
                return String.format("[%d, %d]", x, y);
            }
        }

        return NOT_FOUND_MESSAGE;
    }
}
