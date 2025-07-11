package com.codewars.kyu8.multiplyNumber;

/**
 * Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:
 * <pre>
 * 3 -->    15  (  3 * 5¹)
 * 10 -->   250  ( 10 * 5²)
 * 200 --> 25000  (200 * 5³)
 * 0 -->     0  (  0 * 5¹)
 * -3 -->   -15  ( -3 * 5¹)
 * </pre>
 */
public class Kata {
    public static int multiply(int number) {
        int pow = (int) (Math.log10(Math.abs(number)) + 1);
        return (int) (number * Math.pow(5, pow));
    }
}
