package com.codewars.kyu8.duckDuckGoose;

/**
 * The objective of Duck, duck, goose is to walk in a circle, tapping on each player's head until one is chosen.
 * <p>
 * Task: Given an array of Player objects (an array of associative arrays in PHP) and an index (1-based), return
 * the name of the chosen Player(name is a property of Player objects, e.g Player.name)
 * <p>
 * Example:
 * <p>
 * duck_duck_goose([a, b, c, d], 1) should return a.name<br/>
 * duck_duck_goose([a, b, c, d], 5) should return a.name<br/>
 * duck_duck_goose([a, b, c, d], 4) should return d.name
 * <p>
 * // PHP only
 * <p>
 * duck_duck_goose([$a, $b, $c, $d], 1); // => $a["name"]<br/>
 * duck_duck_goose([$a, $b, $c, $d], 5); // => $a["name"]<br/>
 * duck_duck_goose([$a, $b, $c, $d], 4); // => $d["name"]
 */
public class Kata {
    public static String duckDuckGoose(Player[] players, int goose) {
        int index = goose % players.length - 1;
        return players[index < 0 ? players.length - 1 : index].getName();
    }
}
