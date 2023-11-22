package com.codewars.kyu8.grasshopper.messiGoals;

/**
 * Messi's Goal Total<br/>
 * Use variables to find the sum of the goals Messi scored in 3 competitions
 * <p>
 * Information<br/>
 * Messi goal scoring statistics:
 * <p>
 * Competition	Goals<br/>
 * La Liga	43<br/>
 * Champions League	10<br/>
 * Copa del Rey	5<br/>
 * Task<br/>
 * Create these three variables and store the appropriate values using the table above:<br/>
 * laLigaGoals<br/>
 * championsLeagueGoals<br/>
 * copaDelReyGoals<br/>
 * Create a fourth variable named totalGoals that stores the sum of all of Messi's goals for this year.
 */
public class Goals {
    public static int laLigaGoals = 43;

    public static int championsLeagueGoals = 10;

    public static int copaDelReyGoals = 5;

    public static int totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
}
