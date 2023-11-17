package com.codewars.kyu8.fuelCalculatorTotalCost;

/**
 * In this kata you will have to write a function that takes litres and pricePerLitre (in dollar) as arguments.
 * <p>
 * Purchases of 2 or more litres get a discount of 5 cents per litre, purchases of 4 or more litres get
 * a discount of 10 cents per litre, and so on every two litres, up to a maximum discount of 25 cents per litre.
 * But total discount per litre cannot be more than 25 cents. Return the total cost rounded to 2 decimal places.
 * Also you can guess that there will not be negative or non-numeric inputs.
 * <p>
 * Good Luck!
 * <p>
 * Note
 * 1 Dollar = 100 Cents
 */
public class Kata {
    public static double fuelPrice(int litres, double pricePerLitre) {
        double discount = 0.0;

        for (int i = 1; i <= litres; i++) {
            if (i % 2 == 0 && discount < 0.25) {
                discount += 0.05;
            }
        }

        return litres * (pricePerLitre - discount);
    }
}
