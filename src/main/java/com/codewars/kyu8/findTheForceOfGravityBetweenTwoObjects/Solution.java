package com.codewars.kyu8.findTheForceOfGravityBetweenTwoObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Your job is to find the gravitational force between two spherical objects (obj1 , obj2).
 * input<br/>
 * <p>
 * Two arrays are given :
 * <p>
 * arr_val (value array), consists of 3 elements<br/>
 * 1st element : mass of obj 1<br/>
 * 2nd element : mass of obj 2<br/>
 * 3rd element : distance between their centers<br/>
 * arr_unit (unit array), consists of 3 elements<br/>
 * 1st element : unit for mass of obj 1<br/>
 * 2nd element : unit for mass of obj 2<br/>
 * 3rd element : unit for distance between their centers
 * <p>
 * mass units are :
 * <p>
 * kilogram (kg)<br/>
 * gram (g)<br/>
 * milligram (mg)<br/>
 * microgram (μg)<br/>
 * pound (lb)
 * <p>
 * distance units are :
 * <p>
 * meter (m)<br/>
 * centimeter (cm)<br/>
 * millimeter (mm)<br/>
 * micrometer (μm)<br/>
 * feet (ft)
 * <p>
 * Note
 * <p>
 * value of G = 6.67 × 10<sup>−11</sup> N × kg<sup>−2</sup>× m<sup>2</sup>
 * <p>
 * 1 ft = 0.3048 m
 * <p>
 * 1 lb = 0.453592 kg
 * <p>
 * return value must be Newton for force (obviously)
 * <p>
 * μ copy this from here to use it in your solution
 */
public class Solution {

    private final static double FT = 0.3048;

    private final static double LB = 0.453592;

    public static double solution(double[] arrVal, String[] arrUnit) {
        double g = 6.67e-11;
        double mass1 = convertMass(arrVal[0], arrUnit[0]);
        double mass2 = convertMass(arrVal[1], arrUnit[1]);
        double distance = convertDistance(arrVal[2], arrUnit[2]);

        // F = G * (m1 * m2) / r^2
        return g * mass1 * mass2 / Math.pow(distance, 2);
    }

    private static double convertMass(double value, String unit) {
        return switch (unit) {
            case "g" -> value / 1000d;
            case "mg" -> value / 1000000d;
            case "μg" -> value / 1000000000d;
            case "lb" -> value * LB;
            default -> value;
        };
    }

    private static double convertDistance(double value, String unit) {
        return switch (unit) {
            case "cm" -> value / 100d;
            case "mm" -> value / 1000d;
            case "μm" -> value / 1000000d;
            case "ft" -> value * FT;
            default -> value;
        };
    }
}
