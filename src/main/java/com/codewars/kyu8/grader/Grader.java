package com.codewars.kyu8.grader;

/**
 * Create a function that takes a number as an argument and returns a grade based on that number.
 * <table>
 * <tr><th>Score</th><th>Grade</th></tr>
 * <tr><td>Anything greater than 1 or less than 0.6</td><td>"F"</td></tr>
 * <tr><td>0.9 or greater</td><td>"A"</td></tr>
 * <tr><td>0.8 or greater</td><td>"B"</td></tr>
 * <tr><td>0.7 or greater</td><td>"C"</td></tr>
 * <tr><td>0.6 or greater</td><td>"D"</td></tr>
 * </table>
 * <p>
 * Examples:
 * <pre>
 * grader(0)   should be "F"
 * grader(1.1) should be "F"
 * grader(0.9) should be "A"
 * grader(0.8) should be "B"
 * grader(0.7) should be "C"
 * grader(0.6) should be "D"
 * </pre>
 */
public class Grader {
    public static String grader(double score) {
        if (score <= 1 && score >= 0.9) {
            return "A";
        } else if (score < 0.9 && score >= 0.8) {
            return "B";
        } else if (score < 0.8 && score >= 0.7) {
            return "C";
        } else if (score < 0.7 && score >= 0.6) {
            return "D";
        } else {
            return "F";
        }
    }
}
