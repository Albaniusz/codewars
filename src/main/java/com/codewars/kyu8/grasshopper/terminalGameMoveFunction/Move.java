package com.codewars.kyu8.grasshopper.terminalGameMoveFunction;

/**
 * <h2>Terminal game move function</h2>
 * In this game, the hero moves from left to right. The player rolls the dice and moves the number of spaces indicated
 * by the dice two times.
 * <p>
 * Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return
 * the new position.
 * <p>
 * <h2>Example:</h2>
 * move(3, 6) should equal 15
 */
public class Move {
    public static int move(int position, int roll) {
        return position + roll * 2;
    }
}
