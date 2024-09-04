package com.codewars.kyu7.basicCalculator;

/**
 * Write a function called calculate that takes 3 values. The first and third values are numbers. The second
 * value is a character. If the character is "+" , "-", "*", or "/", the function will return the result
 * of the corresponding mathematical function on the two numbers. If the string is not one of the specified characters,
 * the function should return null (throw an ArgumentException in C#).
 * <p>
 * calculate(2,"+", 4); //Should return 6<br/>
 * calculate(6,"-", 1.5); //Should return 4.5<br/>
 * calculate(-4,"*", 8); //Should return -32<br/>
 * calculate(49,"/", -7); //Should return -7<br/>
 * calculate(8,"m", 2); //Should return null<br/>
 * calculate(4,"/",0) //should return null
 * <p>
 * Keep in mind, you cannot divide by zero. If an attempt to divide by zero is made, return null (throw an ArgumentException in C#)/(None in Python).
 */
public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        if (numberTwo == 0 && "/".equals(operation)) {
            return null;
        }

        if (numberTwo == 0 && "*".equals(operation)) {
            return 0.0;
        }

        return switch (operation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            case "/" -> numberOne / numberTwo;
            default -> null;
        };
    }
}
