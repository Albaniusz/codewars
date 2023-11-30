package com.codewars.kyu8.quarterOfYear;

/**
 * Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
 * <p>
 * For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
 * and month 11 (November), is part of the fourth quarter.
 * <p>
 * Constraint:<br/>
 * 1 <= month <= 12
 */
public class Kata {
    public static int quarterOf(int month) {
        return month < 4 ? 1 : month < 7 ? 2 : month < 10 ? 3 : 4;
    }
}
