package com.codewars.kyu8.findTheIntegral;

/**
 * Create a function that finds the integral of the expression passed.
 * <p>
 * In order to find the integral all you need to do is add one to the exponent (the second argument), and divide
 * the coefficient (the first argument) by that new number.
 * <p>
 * For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent, and divided the coefficient by that
 * new number).
 * <p>
 * Notes:
 * <p>
 * The output should be a string.<br/>
 * The coefficient and exponent is always a positive integer.<br/>
 * <p>
 * Examples<br/>
 * 3, 2  -->  "1x^3"<br/>
 * 12, 5  -->  "2x^6"<br/>
 * 20, 1  -->  "10x^2"<br/>
 * 40, 3  -->  "10x^4"<br/>
 * 90, 2  -->  "30x^3"
 */
public class Kata {
    public static String integrate(int coefficient, int exponent) {
        int integral = coefficient / (exponent + 1);
        return String.format("%dx^%d", integral, coefficient / integral);
    }
}
