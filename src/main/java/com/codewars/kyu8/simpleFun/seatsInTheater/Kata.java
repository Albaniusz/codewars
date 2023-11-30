package com.codewars.kyu8.simpleFun.seatsInTheater;

/**
 * <h2>Task</h2>
 * Your friend advised you to see a new performance in the most popular theater in the city. He knows a lot about art
 * and his advice is usually good, but not this time: the performance turned out to be awfully dull. It's so bad you
 * want to sneak out, which is quite simple, especially since the exit is located right behind your row to the left.
 * All you need to do is climb over your seat and make your way to the exit.
 * <p>
 * The main problem is your shyness: you're afraid that you'll end up blocking the view (even if only for a couple
 * of seconds) of all the people who sit behind you and in your column or the columns to your left. To gain some
 * courage, you decide to calculate the number of such people and see if you can possibly make it to the exit without
 * disturbing too many people.
 * <p>
 * Given the total number of rows and columns in the theater (nRows and nCols, respectively), and the row and column
 * you're sitting in, return the number of people who sit strictly behind you and in your column or to the left,
 * assuming all seats are occupied.
 * <p>
 * <h2>Example</h2>
 * For nCols = 16, nRows = 11, col = 5 and row = 3, the output should be 96.
 * <p>
 * Here is what the theater looks like:
 * <p>
 * <img src="https://files.gitter.im/myjinxin2015/eAjZ/blob"/>
 * <p>
 * <h2>Input/Output</h2>
 * [input] integer nCols
 * <p>
 * An integer, the number of theater's columns.
 * <p>
 * Constraints: 1 ≤ nCols ≤ 1000.
 * <p>
 * [input] integer nRows
 * <p>
 * An integer, the number of theater's rows.
 * <p>
 * Constraints: 1 ≤ nRows ≤ 1000.
 * <p>
 * [input] integer col
 * <p>
 * An integer, the column number of your own seat (with the rightmost column having index 1).
 * <p>
 * Constraints: 1 ≤ col ≤ nCols.
 * <p>
 * [input] integer row
 * <p>
 * An integer, the row number of your own seat (with the front row having index 1).
 * <p>
 * Constraints: 1 ≤ row ≤ nRows.
 * <p>
 * [output] an integer<br/>
 * The number of people who sit strictly behind you and in your column or to the left.
 */
public class Kata {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - col + 1) * (nRows - row);
    }
}
