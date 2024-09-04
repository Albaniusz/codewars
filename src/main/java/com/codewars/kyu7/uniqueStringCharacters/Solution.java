package com.codewars.kyu7.uniqueStringCharacters;

import java.util.stream.Collectors;

/**
 * In this Kata, you will be given two strings a and b and your task will be to return the characters that are not common in the two strings.
 * <p>
 * For example:
 * <p>
 * solve("xyab","xzca") = "ybzc"<br/>
 * --The first string has 'yb' which is not in the second string.<br/>
 * --The second string has 'zc' which is not in the first string.<br/>
 * <p>
 * Notice also that you return the characters from the first string concatenated with those from the second string.
 * <p>
 * More examples in the tests cases.
 * <p>
 * Good luck!
 */
public class Solution {
    public static String solve(String a, String b) {
        return collectUnique(a, b) + collectUnique(b, a);
    }

    private static String collectUnique(String stringA, String stringB) {
        return stringA.chars()
            .mapToObj(e -> (char) e)
            .map(Object::toString)
            .filter(i -> !stringB.contains(i))
            .collect(Collectors.joining());
    }
}
