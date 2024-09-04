package com.codewars.kyu7.the80sKids.punkyBrewstersSocks;

/**
 * Punky loves wearing different colored socks, but Henry can't stand it.
 * <p>
 * Given an array of different colored socks, return a pair depending on who was picking them out.
 * <p>
 * Example:
 * <p>
 * getSocks("Punky", ["red","blue","blue","green"]) -> ["red", "blue"]
 * <p>
 * Note that Punky can have any two colored socks, in any order, as long as they are different and both exist. Henry
 * always picks a matching pair.
 * <p>
 * If there is no possible combination of socks, return an empty array.
 */
public class EightiesKids3 {

    private final static String HENRY = "Henry";

    private final static String PUNKY = "Punky";

    public static String[] getSocks(String name, String[] socks) {
        String left = socks[0];
        String right = "";

        if (HENRY.equals(name)) {
            for (int i = 1; i < socks.length; i++) {
//                if ( && left.equals(socks[i])) {
//                    right = socks[i];
//                    break;
//                } else if ( && !left.equals(socks[i])) {
//                    right = socks[i];
//                    break;
//                }
            }
            left = socks[0];
        } else if (PUNKY.equals(name)) {
            for (int i = 1; i < socks.length; i++) {
                if (!left.equals(socks[i])) {
                    right = socks[i];
                    break;
                }
            }
        }



        return right.isEmpty() ? new String[]{} : new String[]{left, right};
    }
}
