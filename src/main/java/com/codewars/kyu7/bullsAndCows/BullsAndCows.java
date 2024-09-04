package com.codewars.kyu7.bullsAndCows;

import com.google.common.base.Preconditions;

import java.util.stream.Stream;

/**
 * In this kata you will try to recreate a simple code-breaking game. It is called "Bulls and Cows". The rules are
 * quite simple:
 * <p>
 * The computer generates a secret number consisting of 4 distinct digits. Then the player, in 8 turns, tries to guess
 * the number. As a result he receives from the computer the number of matches. If the matching digits are in their
 * right positions, they are "bulls", if in different positions, they are "cows".
 * <p>
 * To implement this you will use:
 * <ol>
 * <li>a constructor (int) - initiates the game, receives a number and then sets it as the secret number.</li>
 * <li>and a function "compare with (int)" - compares the given and the secret numbers and then returns a String
 * formatted as "X bull/bulls and Y cow/cows".</li>
 * </ol>
 * However, there are some notes:
 * <ol>
 * <li>if the given number matches the secret number instead of returning "4 bulls and 0 cows", return "You win!".
 * Any next attempts to play the game (even with invalid numbers) should return "You already won!"</li>
 * <li>if the amount of turns in this game is more than 8 (invalid turns are not counted) the returned String should
 * be "Sorry, you're out of turns!".</li>
 * <li>After checking the turns you should validate the given number. If it does not correspond to the conditions you
 * should throw an exception : IllegalArgumentException</li>
 * </ol>
 */
public class BullsAndCows {
    public BullsAndCows(int n) {
        Preconditions.checkArgument(n < 1000, "Illegal Argument passed: Number %s is smaller than 1000.", n);
        Preconditions.checkArgument(n > 9999, "Illegal Argument passed: Number %s is greater than 9999.", n);

        char[] chars = String.valueOf(n).toCharArray();
        Preconditions.checkArgument(chars.length != Stream.of(chars).distinct().count(), "Illegal Argument passed: The digits in the number %s are not distinguished.", n);
    }

    public String compareWith(int n) {
        //compare and print bulls and cows

        return "";
    }
}
