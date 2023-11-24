package com.codewars.kyu8.rockPaperScissors;

/**
 * Rock Paper Scissors<br/>
 * Let's play! You have to return which player won! In case of a draw return Draw!.
 * <p>
 * Examples(Input1, Input2 --> Output):
 * <p>
 * "scissors", "paper" --> "Player 1 won!"<br/>
 * "scissors", "rock" --> "Player 2 won!"<br/>
 * "paper", "paper" --> "Draw!"
 */
public class Kata {

    private static final String SCISSORS = "scissors";

    private static final String PAPER = "paper";

    private static final String ROCK = "rock";

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }

        return (SCISSORS.equals(p1) && PAPER.equals(p2))
            || (PAPER.equals(p1) && ROCK.equals(p2))
            || (ROCK.equals(p1) && SCISSORS.equals(p2))
            ? "Player 1 won!" : "Player 2 won!";
    }
}
