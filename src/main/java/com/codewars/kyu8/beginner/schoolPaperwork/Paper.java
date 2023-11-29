package com.codewars.kyu8.beginner.schoolPaperwork;

/**
 * Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
 * <p>
 * Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
 * <p>
 * Example:<br/>
 * n= 5, m=5: 25<br/>
 * n=-5, m=5:  0
 * <p>
 * Waiting for translations and Feedback! Thanks!
 */
public class Paper {
    public static int paperWork(int n, int m) {
        return n <= 0 || m <= 0 ? 0 : n * m;
    }
}
