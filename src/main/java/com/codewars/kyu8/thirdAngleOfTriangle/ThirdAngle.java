package com.codewars.kyu8.thirdAngleOfTriangle;

/**
 * You are given two interior angles (in degrees) of a triangle.
 * <p>
 * Write a function to return the 3rd.
 * <p>
 * Note: only positive integers will be tested.
 * <p>
 * <a href="https://en.wikipedia.org/wiki/Triangle">https://en.wikipedia.org/wiki/Triangle</a>
 */
public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }
}
