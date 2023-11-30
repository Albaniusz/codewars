package com.codewars.kyu8.doubleChar;

/**
 * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
 * <p>
 * Examples (Input -> Output):
 * <ul>
 * <li> "String"      -> "SSttrriinngg"</li>
 * <li> "Hello World" -> "HHeelllloo  WWoorrlldd"</li>
 * <li> "1234!_ "     -> "11223344!!__  "</li>
 * </ul>
 * Good Luck!
 */
public class Solution {
    public static String doubleChar(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char chr : s.toCharArray()) {
            stringBuilder.append(chr).append(chr);
        }

        return stringBuilder.toString();
    }
}
