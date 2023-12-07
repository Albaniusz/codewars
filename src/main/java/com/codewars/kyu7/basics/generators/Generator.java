package com.codewars.kyu7.basics.generators;

/**
 * Basics - Generators #1
 * <p>
 * Generators are very useful things in programming, in this series we will learn how to use generators and see how
 * we can apply generators to common programming challenges.
 * <p>
 * Task
 * <p>
 * You must complete the generator function that must increment a counter by 1 each time also if the argument is
 * supplied (will always be a number) you must then change the counter to that number.
 * <p>
 * Important
 * <p>
 * The counter must start at 1 when the generator is initialized
 * <p>
 * More Info: <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Iterators_and_Generators">Iterators and Generators (JavaScript)</a>, <a href="http://php.net/manual/en/language.generators.overview.php">Generators Overview (PHP)</a>
 */
public class Generator {

    private static int counter = 1;

    public int next() {
        return counter++;
    }

    public int next(int i) {
        return i;
    }
}
