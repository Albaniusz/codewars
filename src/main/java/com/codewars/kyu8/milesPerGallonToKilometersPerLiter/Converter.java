package com.codewars.kyu8.milesPerGallonToKilometersPerLiter;

/**
 * Sometimes, I want to quickly be able to convert miles per imperial gallon (mpg) into kilometers per liter (kpl).
 * <p>
 * Create an application that will display the number of kilometers per liter (output) based on the number of miles
 * per imperial gallon (input).
 * <p>
 * Make sure to round off the result to two decimal points.
 * <p>
 * Some useful associations relevant to this kata:
 * <p>
 * 1 Imperial Gallon = 4.54609188 litres<br/>
 * 1 Mile = 1.609344 kilometres
 */
public class Converter {
    public static float mpgToKPM(final float mpg) {
        return (float) (Math.round(mpg * 0.354006 * Math.pow(10, 2)) / Math.pow(10, 2));
    }
}
