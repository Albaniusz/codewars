package com.codewars.kyu8.didSheSayHallo;

import java.util.Arrays;
import java.util.List;

/**
 * You received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met
 * yesterday evening?
 * <p>
 * Write a simple function to check if the string contains the word hallo in different languages.
 * <p>
 * These are the languages of the possible people you met the night before:
 * <p>
 * hello - english<br/>
 * ciao - italian<br/>
 * salut - french<br/>
 * hallo - german<br/>
 * hola - spanish<br/>
 * ahoj - czech republic<br/>
 * czesc - polish
 * <p>
 * Notes
 * <p>
 * you can assume the input is a string.<br/>
 * to keep this a beginner exercise you don't need to check if the greeting is a subset of word (Hallowen can pass the test)<br/>
 * function should be case insensitive to pass the tests
 */
public class Kata {
    public static boolean validateHello(String greetings) {
        List<String> phrases = Arrays.asList("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc");
        return phrases.stream().anyMatch(item -> greetings.toLowerCase().contains(item));
    }
}
