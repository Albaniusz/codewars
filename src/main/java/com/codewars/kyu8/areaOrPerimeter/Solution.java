package com.codewars.kyu8.areaOrPerimeter;

/**
 * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.<br/>
 * If it is a square, return its area. If it is a rectangle, return its perimeter.
 * <p>
 * Example(Input1, Input2 --> Output):
 * <p>
 * 6, 10 --> 32<br/>
 * 3, 3 --> 9<br/>
 * Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
 */
public class Solution {
    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : 2 * l + 2 * w;
    }
}
