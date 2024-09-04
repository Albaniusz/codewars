package com.codewars.kyu7.tenGreenBottles;

import java.util.Arrays;
import java.util.List;

/**
 * Who knows the nursery rhyme <a href="https://www.youtube.com/watch?v=Ak7kedzR8bg">Ten Green Bottles</a>?
 * <p>
 * Lyrics:
 * <p>
 * Ten green bottles hanging on the wall,<br/>
 * Ten green bottles hanging on the wall,<br/>
 * And if one green bottle should accidentally fall,<br/>
 * There'll be nine green bottles hanging on the wall.
 * <p>
 * Nine green bottles hanging on the wall,<br/>
 * Nine green bottles hanging on the wall,<br/>
 * And if one green bottle should accidentally fall,<br/>
 * There'll be eight green bottles hanging on the wall.
 * <p>
 * Eight green bottles hanging on the wall...<br/>
 * Seven green bottles hanging on the wall...<br/>
 * ...
 * <p>
 * One green bottle hanging on the wall,<br/>
 * One green bottle hanging on the wall,<br/>
 * If that one green bottle should accidentally fall,<br/>
 * There'll be no green bottles hanging on the wall.
 * <p>
 * Task
 * <p>
 * Write some amazing code to reproduce the above lyrics starting from n green bottles!
 * <ul>
 * <li>parameter n is 1 to 10</li>
 * <li>newline terminates every line (including the last)</li>
 * <li>don't forget the blank lines between the verses</li>
 * </ul>
 */
public class Dinglemouse {

    private static final String phrase = "%s green bottles hanging on the wall,\n" +
        "%s green bottles hanging on the wall,\n" +
        "And if one green bottle should accidentally fall,\n" +
        "There'll be %s green bottle%s hanging on the wall.\n";

    private static final String phraseLast = "One green bottle hanging on the wall,\n" +
        "One green bottle hanging on the wall,\n" +
        "If that one green bottle should accidentally fall,\n" +
        "There'll be no green bottles hanging on the wall.\n";

    private static final List<String> numNames = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");

    public static String tenGreenBottles(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = n - 1; i > 0; i--) {
            stringBuilder.append(String.format(phrase, numNames.get(i),
                numNames.get(i),
                numNames.get(i - 1).toLowerCase(),
                i != 1 ? "s" : ""));
            stringBuilder.append("\n");
        }
        stringBuilder.append(phraseLast);

        return stringBuilder.toString();
    }
}
