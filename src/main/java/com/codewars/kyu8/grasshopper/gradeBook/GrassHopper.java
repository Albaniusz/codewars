package com.codewars.kyu8.grasshopper.gradeBook;

/**
 * Grade book
 * <p>
 * Complete the function so that it finds the average of the three scores passed to it and returns the letter value
 * associated with that grade.
 * <p>
 * Numerical Score	Letter Grade<br/>
 * 90 <= score <= 100	'A'<br/>
 * 80 <= score < 90	'B'<br/>
 * 70 <= score < 80	'C'<br/>
 * 60 <= score < 70	'D'<br/>
 * 0 <= score < 60	'F'
 * <p>
 * Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
 */
public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        double result = (s1 + s2 + s3) / 3d;
        if (result >= 90d) {
            return 'A';
        } else if (result >= 80d) {
            return 'B';
        } else if (result >= 70d) {
            return 'C';
        } else if (result >= 60d) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
