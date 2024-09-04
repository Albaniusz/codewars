package com.codewars.kyu8.theIfFunction;

import org.apache.commons.lang3.BooleanUtils;

/**
 * Create a function called _if which takes 3 arguments: a value bool and 2 functions (which do not take any parameters): func1 and func2
 * <p>
 * When bool is truthy, func1 should be called, otherwise call the func2.
 * <p>
 * Example:
 * <pre>
 * Kata._if(true, () -> System.out.println("true"), () -> System.out.println("false"));
 * // prints "true" to the System out.
 * </pre>
 */
public class Kata {
    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        if (BooleanUtils.isTrue(bool)) {
            func1.run();
        } else {
            func2.run();
        }
    }
}
