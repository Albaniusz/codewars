package com.codewars.kyu8.areYouPlayingBanjo;

/**
 * Create a function which answers the question "Are you playing banjo?".<br/>
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 * <p>
 * The function takes a name as its only argument, and returns one of the following strings:
 * <p>
 * name + " plays banjo"<br/>
 * name + " does not play banjo"<br/>
 * Names given are always valid strings.
 */
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return String.format("%s %s banjo", name, name.toLowerCase().startsWith("r") ? "plays" : "does not play");
    }
}
