package com.codewars.kyu7.sumOfNumbersFrom0ToN;

/**
 * Description:
 * <p>
 * We want to generate a function that computes the series starting from 0 and ending until the given number.
 * <p>
 * Example:
 * <p>
 * Input: > 6
 * <p>
 * Output: 0+1+2+3+4+5+6 = 21
 * <p>
 * Input: > -15
 * <p>
 * Output: -15<0
 * <p>
 * Input: > 0
 * <p>
 * Output: 0=0
 */
public class SequenceSum {
    public static String showSequence(int value) {
        if (value < 0) {
            return "-" + value + "<0";
        }

        if (value == 0) {
            return "0=0";
        }

        StringBuilder stringBuilder = new StringBuilder("0");

        int sum = 0;

        for (int i = 1; i <= value; i++) {
            sum += i;
            stringBuilder.append("+").append(i);
        }
        stringBuilder.append(" = ").append(sum);

        return stringBuilder.toString();
    }
}
