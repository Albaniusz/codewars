package com.codewars.kyu8.holiday.sharkPontoon;

/**
 * Your friend invites you out to a cool floating pontoon around 1km off the beach. Among other things, the pontoon
 * has a huge slide that drops you out right into the ocean, a small way from a set of stairs used to climb out.
 * <p>
 * As you plunge out of the slide into the water, you see a shark hovering in the darkness under the pontoon... Crap!
 * <p>
 * You need to work out if the shark will get to you before you can get to the pontoon. To make it easier... as you
 * do the mental calculations in the water you either freeze when you realise you are dead, or swim when you realise
 * you can make it!
 * <p>
 * You are given 5 variables;
 * <p>
 * sharkDistance = distance from the shark to the pontoon. The shark will eat you if it reaches you before you escape
 * to the pontoon.
 * <p>
 * sharkSpeed = how fast it can move in metres/second.
 * <p>
 * pontoonDistance = how far you need to swim to safety in metres.
 * <p>
 * youSpeed = how fast you can swim in metres/second.
 * <p>
 * dolphin = a boolean, if true, you can half the swimming speed of the shark as the dolphin will attack it.
 * <p>
 * The pontoon, you, and the shark are all aligned in one dimension.
 * <p>
 * If you make it, return "Alive!", if not, return "Shark Bait!".
 */
public class SharkPontoon {
    public static String shark(int pontoonDistance,
                               int sharkDistance,
                               int youSpeed,
                               int sharkSpeed,
                               boolean dolphin) {
        return sharkDistance / (dolphin ? sharkSpeed / 2d : sharkSpeed) > pontoonDistance / youSpeed ? "Alive!" : "Shark Bait!";
    }
}
