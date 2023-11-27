package com.codewars.kyu8.grasshopper.messiGoalsFunction;

/**
 * Messi goals function
 * <p>
 * Messi is a soccer player with goals in three leagues:
 * <p>
 * LaLiga<br/>
 * Copa del Rey<br/>
 * Champions<br/>
 * Complete the function to return his total number of goals in all three leagues.
 * <p>
 * Note: the input will always be valid.
 * <p>
 * For example:
 * <p>
 * 5, 10, 2  -->  17
 */
public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}
