package com.codewars.kyu8.colorGhost;

import java.util.ArrayList;
import java.util.List;

/**
 * <b2>Color Ghost</b2>
 * Create a class Ghost
 * <p>
 * Ghost objects are instantiated without any arguments.
 * <p>
 * Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
 * <p>
 * Ghost ghost = new Ghost();<br/>
 * ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */
public class Ghost {
    private final List<String> colors;

    public Ghost() {
        colors = new ArrayList<>();
        colors.add("white");
        colors.add("yellow");
        colors.add("purple");
        colors.add("red");
    }

    public String getColor() {
        return colors.get((int) (Math.random() * 4));
    }
}
