package com.codewars.kyu8.simpleCalculator;

/**
 * You are required to create a simple calculator that returns the result of addition, subtraction, multiplication or division of two numbers.
 * <p>
 * Your function will accept three arguments:
 * The first and second argument should be numbers.
 * The third argument should represent a sign indicating the operation to perform on these two numbers.
 * <p>
 * You should return the result of applying the given operation to these numbers.
 * <p>
 * Note: In dynamically typed languages (JS, PHP, Python), the first and second arguments can be not numbers. In that case, return "unknown value".
 * <p>
 * If the given operation to perform on the two numbers is not one of the four mentioned above, you should:
 * <p>
 * return a value:
 * "unknown value" (JS, PHP, Python)
 * throw an exception:
 * std::invalid_argument (C++)
 * ArgumentException (C#)
 * IllegalArgumentException (Java)
 * Example:
 * <pre>
 * arguments: 1, 2, "+"
 * should return 3
 *
 * arguments: 1, 2, "&"
 * refer to the description for what you should return in this case
 *
 * # Specifically for dynamically-typed languages:
 *
 * arguments: 1, "k", "*"
 * should return "unknown value"
 * </pre>
 * <p>
 * Good luck!
 */
public class Calculator {
    public static double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException();
        };
    }
}
