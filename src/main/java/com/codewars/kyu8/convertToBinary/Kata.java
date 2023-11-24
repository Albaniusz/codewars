package com.codewars.kyu8.convertToBinary;

/**
 * Task Overview
 * <p>
 * Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in
 * a binary format.
 * <p>
 * to_binary(1)  / should return 1<br/>
 * to_binary(5)  / should return 101<br/>
 * to_binary(11) / should return 1011
 */
public class Kata {
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
