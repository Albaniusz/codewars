package com.codewars.kyu8.areaOfASquare;

import java.text.DecimalFormat;

/**
 * Complete the function that calculates the area of the red square, when the length of the circular arc A
 * is given as the input. Return the result rounded to two decimals.
 * <p>
 * <img src="https://i.imgur.com/nJrae8n.png"/>
 * <p>
 * Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
 */
public class Geometry {
    public static double squareArea(double a) {
        double scale = Math.pow(10, 2);
        return Math.round(Math.pow(a * 4d / Math.PI / 2d, 2d) * scale) / scale;
    }
}
