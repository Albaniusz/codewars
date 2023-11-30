package com.codewars.kyu8.basicMathematicalOperations;

/**
 * Your task is to create a function that does four basic mathematical operations.
 * <p>
 * The function should take three arguments - operation(string/char), value1(number), value2(number).<br/>
 * The function should return result of numbers after applying the chosen operation.
 * <p>
 * Examples(Operator, value1, value2) --> output<br/>
 * ('+', 4, 7) --> 11<br/>
 * ('-', 15, 18) --> -3<br/>
 * ('*', 5, 5) --> 25<br/>
 * ('/', 49, 7) --> 7
 */
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> v1 + v2;
        };
    }
}
