package com.codewars.kyu7.trigrams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Trigrams are a special case of the n-gram, where n is 3. One trigram is a continous sequence of 3 chars in phrase.
 * <a href="https://en.wikipedia.org/wiki/Trigram">Wikipedia</a>
 * <ul>
 * <li>return all trigrams for the given phrase</li>
 * <li>replace spaces with underscore (_)</li>
 * <li>return an empty string for phrases shorter than 3</li>
 * </ul>
 * Example:
 * <p>
 * "the quick red" --> "the he_ e_q _qu qui uic ick ck_ k_r _re red"
 */
public class Trigrams {
    public static String trigrams(String phrase) {
        if (phrase.length() < 3) {
            return "";
        }

        char[] array = phrase.toCharArray();

        return IntStream.rangeClosed(0, array.length - 3)
            .mapToObj(i -> (array[i] + Character.toString(array[i + 1]) + array[i + 2]).replace(" ", "_"))
            .collect(Collectors.joining(" "));
    }
}
