package com.codewars.kyu8.thinkful.logicDrills.trafficLight;

/**
 * You're writing code to control your town's traffic lights. You need a function to handle each change from green,
 * to yellow, to red, and then to green again.
 * <p>
 * Complete the function that takes a string as an argument representing the current state of the light and returns
 * a string representing the state the light should change to.
 * <p>
 * For example, when the input is green, output should be yellow.
 */
public class TrafficLights {
    public static String updateLight(String current) {
        return switch (current) {
            case "red" -> "green";
            case "green" -> "yellow";
            default -> "red";
        };
    }
}
