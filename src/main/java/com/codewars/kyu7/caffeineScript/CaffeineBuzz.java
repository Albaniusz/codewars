package com.codewars.kyu7.caffeineScript;

/**
 * Complete the function which takes a non-zero integer as its argument.
 * <p>
 * If the integer is divisible by 3, return the string "Java".
 * <p>
 * If the integer is divisible by 3 and divisible by 4, return the string "Coffee"
 * <p>
 * If one of the condition above is true and the integer is even, add "Script" to the end of the string.
 * <p>
 * If none of the condition is true, return the string "mocha_missing!"
 * <p>
 * Examples
 * <p>
 * 1   -->  "mocha_missing!"<br/>
 * 3   -->  "Java"<br/>
 * 6   -->  "JavaScript"<br/>
 * 12  -->  "CoffeeScript"
 */
public class CaffeineBuzz {
    private final static String DEFAULT = "mocha_missing!";

    public static String caffeineBuzz(int n) {
        String result = DEFAULT;

        if (n % 3 == 0) {
            result = n % 4 == 0 ? "Coffee" : "Java";
        }

        if (!DEFAULT.equals(result) && n % 2 == 0) {
            result += "Script";
        }

        return result;
    }
}
