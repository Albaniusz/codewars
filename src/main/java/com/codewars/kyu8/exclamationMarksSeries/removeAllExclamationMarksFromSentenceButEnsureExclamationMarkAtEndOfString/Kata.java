package com.codewars.kyu8.exclamationMarksSeries.removeAllExclamationMarksFromSentenceButEnsureExclamationMarkAtEndOfString;

/**
 * Description:
 * <p>
 * Remove all exclamation marks from sentence but ensure a exclamation mark at the end of string. For a beginner kata, you can assume that the input data is always a non empty string, no need to verify it.
 * <p>
 * Examples
 * <pre>
 * "Hi!"     ---> "Hi!"
 * "Hi!!!"   ---> "Hi!"
 * "!Hi"     ---> "Hi!"
 * "!Hi!"    ---> "Hi!"
 * "Hi! Hi!" ---> "Hi Hi!"
 * "Hi"      ---> "Hi!"
 * </pre>
 */
public class Kata {
    static String remove(String s) {
        return s.replace("!", "") + "!";
    }
}
