package com.codewars.kyu7.theSpeedOfLetters;

/**
 * Given a string as input, return a new string with each letter pushed to the right by its respective index in the alphabet.
 * <p>
 * We all know that A is a slow and Z is a fast letter. This means that Z gets shifted to the right by 25 spaces, A doesn't get shifted at all, and B gets shifted by 1 space.
 * <p>
 * You can assume the following things about your input:
 * <ul>
 * <li>It will only contain uppercase letters from A to Z, no whitespaces or punctuation;</li>
 * <li>Input strings will not exceed 100 characters (although your output string might!)</li>
 * </ul>
 * Note that if 2 or more letters fall onto the same space after shifting, the latest character will be used. For example: "BA" -> " A"
 * <p>
 * Examples
 * <p>
 * "AZ"   -->  "A&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Z"<br/>
 * "ABC"  -->  "A&nbsp;B&nbsp;C"<br/>
 * "ACE"  -->  "A&nbsp;&nbsp;C&nbsp;&nbsp;E"<br/>
 * "CBA"  -->  "&nbsp;&nbsp;A"<br/>
 * "HELLOWORLD"  -->  "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;E&nbsp;H&nbsp;&nbsp;&nbsp;&nbsp;DLL&nbsp;&nbsp;&nbsp;OLO&nbsp;&nbsp;&nbsp;R&nbsp;&nbsp;W"
 */
public class Kata {
    public static String speedify(final String input) {
        return ""; // your code here
    }
}
