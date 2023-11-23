package com.codewars.kyu8.formattingDecimalPlaces;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input
 * is a valid number because only valid numbers are used in the tests.
 * <p>
 * Example:<br/>
 * 5.5589 is rounded 5.56<br/>
 * 3.3424 is rounded 3.34
 */
public class Numbers {
    public static double TwoDecimalPlaces(double number) {
        return new BigDecimal(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
