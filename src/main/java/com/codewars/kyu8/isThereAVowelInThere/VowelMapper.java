package com.codewars.kyu8.isThereAVowelInThere;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of numbers, check if any of the numbers are the character codes for lower case vowels (a, e, i, o, u).
 * <p>
 * If they are, change the array value to a string of that vowel.
 * <p>
 * input [100,100,116,105,117,121]=>[100,100,116,"i","u",121] output Return the resulting array.
 */
public class VowelMapper {
    private static final List<Integer> vowels = Arrays.asList(97, 101, 105, 111, 117);

    public static List<Object> isVow(List<Integer> a) {
        return a.stream()
            .map(item -> (Object) (vowels.contains(item) ? Character.toString(item) : item))
            .toList();
    }
}
