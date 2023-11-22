package com.codewars.kyu8.grasshopper.checkForFactor;

/**
 * This function should test if the factor is a factor of base.
 * <p>
 * Return true if it is a factor or false if it is not.
 * <p>
 * About factors<br/>
 * Factors are numbers you can multiply together to get another number.
 * <p>
 * 2 and 3 are factors of 6 because: 2 * 3 = 6
 * <p>
 * You can find a factor by dividing numbers. If the remainder is 0 then the number is a factor.<br/>
 * You can use the mod operator (%) in most languages to check for a remainder<br/>
 * For example 2 is not a factor of 7 because: 7 % 2 = 1
 * <p>
 * Note: base is a non-negative number, factor is a positive number.
 */
public class Kata {
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
