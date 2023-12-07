package com.codewars.kyu7.decimalDecomposition;

import java.util.StringJoiner;

/**
 * Your task is, Easy kata!!
 * <p>
 * You must develop a method which returns a decimal decomposition given a number
 * <p>
 * public static String decimalDecomposition(int number){...}
 * <p>
 * Some examples:
 * <p>
 * number = 126, method returns "100+20+6",<br/>
 * number = 712654, method returns "700000+10000+2000+600+50+4"
 * <p>
 * NOTE: 0 < number
 */
public class DecimalDecomposition {
    public static String decimalDecomposition(int number) {
        StringJoiner stringJoiner = new StringJoiner("+");
        String zero = "0";

        String stringValue = String.valueOf(number);
        int counter = stringValue.length() - 1;

        for (char chr : stringValue.toCharArray()) {
            if (chr != 48) {
                stringJoiner.add(chr + zero.repeat(counter));
            }
            counter--;
        }

        return stringJoiner.toString();
    }
}
