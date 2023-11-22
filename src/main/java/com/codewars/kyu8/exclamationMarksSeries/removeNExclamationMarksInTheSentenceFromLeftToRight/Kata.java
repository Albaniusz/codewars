package com.codewars.kyu8.exclamationMarksSeries.removeNExclamationMarksInTheSentenceFromLeftToRight;

/**
 * Remove n exclamation marks in the sentence from left to right. n is positive integer.
 * <p>
 * Examples
 * remove("Hi!",1) === "Hi"
 * remove("Hi!",100) === "Hi"
 * remove("Hi!!!",1) === "Hi!!"
 * remove("Hi!!!",100) === "Hi"
 * remove("!Hi",1) === "Hi"
 * remove("!Hi!",1) === "Hi!"
 * remove("!Hi!",100) === "Hi"
 * remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
 * remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
 * remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
 * remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
 */
public class Kata {
    public static String remove(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (char character : s.toCharArray()) {
            if (character != '!' || counter >= n) {
                sb.append(character);
            } else {
                counter++;
            }
        }

        return sb.toString();
    }
}
