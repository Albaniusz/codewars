package com.codewars.kyu8.easyLogs;

/**
 * Add two logs with base X, with the value of A and B. Example log A + log B where the base is X.
 */
public class EasyLogs {
    public static double logs(double x, double a, double b) {
        return (Math.log(a) + Math.log(b)) / Math.log(x);
    }
}
