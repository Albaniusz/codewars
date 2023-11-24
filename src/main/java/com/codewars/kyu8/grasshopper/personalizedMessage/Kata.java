package com.codewars.kyu8.grasshopper.personalizedMessage;

/**
 * Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
 * <p>
 * Use conditionals to return the proper message:
 * <p>
 * case	return<br/>
 * name equals owner	'Hello boss'<br/>
 * otherwise	'Hello guest'
 */
public class Kata {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
