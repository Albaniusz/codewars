package com.codewars.kyu7.guavaAgainstMillionDollarError;

import com.google.common.base.Preconditions;

/**
 * Let's use Google Guava Library to fight against the million dollar error.
 * <p>
 * As start point we have a simple sum function and we need it to validate the following, in order:
 * <ul>
 * <li>that parameters are not null</li>
 * <li>if first parameter is null throw NPE with message "Illegal Argument passed: First parameter is Null."</li>
 * <li>if second parameter is null throw NPE with message "Illegal Argument passed: Second parameter is Null."</li>
 * <li>that parameters are positive ( > 0 )</li>
 * <li>if this is not the case then throw IllegalArgumentException with message "Illegal Argument passed: Non-positive value d." where d is the non-positive value (no need to format the value, just turn it into a string). If both values are non-positive, use the first parameter.</li>
 * </ul>
 * Hint: you could use a reading to class com.google.common.base.Preconditions
 */
public class Sum {
    public static Double sum(Double a, Double b) {
        Preconditions.checkNotNull(a, "Illegal Argument passed: First parameter is Null.");
        Preconditions.checkNotNull(b, "Illegal Argument passed: Second parameter is Null.");
        Preconditions.checkArgument(a > 0, "Illegal Argument passed: Non-positive value %s.", a);
        Preconditions.checkArgument(b > 0, "Illegal Argument passed: Non-positive value %s.", b);

        return a + b;
    }
}
