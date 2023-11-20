package com.codewars.kyu8.tipCalculator;

import java.util.Objects;

/**
 * Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.
 * <p>
 * You need to consider the following ratings:
 * <p>
 * Terrible: tip 0%
 * Poor: tip 5%
 * Good: tip 10%
 * Great: tip 15%
 * Excellent: tip 20%
 * <p>
 * The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:
 * <p>
 * "Rating not recognised" in Javascript, Python and Ruby...
 * ...or null in Java
 * ...or -1 in C#
 * <p>
 * Because you're a nice person, you always round up the tip, regardless of the service.
 */
public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        Double tip = 0d;
        switch (rating.toLowerCase()) {
            case "excellent":
                tip = amount * 0.2;
                break;
            case "great":
                tip = amount * 0.15;
                break;
            case "good":
                tip = amount * 0.1;
                break;
            case "poor":
                tip = amount * 0.05;
                break;
            case "terrible":
                tip = 0d;
                break;
            default:
                tip = null;
        }
        return Objects.nonNull(tip) ? (int) Math.ceil(tip) : null;
    }
}
