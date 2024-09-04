package com.codewars.kyu8.grasshopper.terminalGameCombatFunction;

/**
 * Create a combat function that takes the player's current health and the amount of damage received, and returns
 * the player's new health. Health can't be less than 0.
 */
public class Game {
    public static double combat(int health, int damage) {
        return Math.max(health - damage, 0);
    }
}
