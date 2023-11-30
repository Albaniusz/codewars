package com.codewars.kyu8.welcomeToCity;

/**
 * Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array
 * consisting of one or more values that should be joined together with one space between each, and the length
 * of the name array in test cases will vary.
 * <p>
 * Example:
 * <p>
 * ['John', 'Smith'], 'Phoenix', 'Arizona'
 * <p>
 * This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
 */
public class Hello {
    public String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }
}
