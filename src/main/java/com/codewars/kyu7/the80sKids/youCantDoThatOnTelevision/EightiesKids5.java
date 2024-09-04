package com.codewars.kyu7.the80sKids.youCantDoThatOnTelevision;

/**
 * There are just some things you can't do on television. In this case, you've just come back from having
 * a "delicious" Barth burger and you're set to give an interview. The Barth burger has made you queezy,
 * and you've forgotten some of the import rules of the "You Can't Do That on Television" set.
 * <p>
 * If you say any of the following words a large bucket of "water" will be dumped on you: "water", "wet",
 * "wash" This is true for any form of those words, like "washing", "watered", etc.
 * <p>
 * If you say any of the following phrases you will be doused in "slime": "I don't know", "slime"
 * <p>
 * If you say both in one sentence, a combination of water and slime, "sludge", will be dumped on you.
 * <p>
 * Write a function, bucketOf(str), that takes a string and determines what will be dumped on your head. If you
 * haven't said anything you shouldn't have, the bucket should be filled with "air". The words should be tested
 * regardless of case.
 * <p>
 * Examples:
 * <p>
 * bucketOf("What is that, WATER?!?") -> "water"<br/>
 * bucketOf("I don't know if I'm doing this right.") -> "slime"<br/>
 * bucketOf("You won't get me!") -> "air"
 */
public class EightiesKids5 {

    private final static String AIR = "air";

    private final static String SLIME = "slime";

    private final static String SLUDGE = "sludge";

    private final static String WATER = "water";

    public static String bucketOf(String said) {
        said = said.toLowerCase();

        String result = AIR;

        if (said.contains("water") || said.contains("wet") || said.contains("wash")) {
            result = WATER;
        }

        if (said.contains("i don't know") || said.contains("slime")) {
            result = AIR.equals(result) ? SLIME : SLUDGE;
        }

        return result;
    }
}
