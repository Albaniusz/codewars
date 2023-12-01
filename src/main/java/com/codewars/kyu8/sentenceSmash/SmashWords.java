package com.codewars.kyu8.sentenceSmash;

/**
 * <h2>Sentence Smash</h2>
 * Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
 * You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
 * Be careful, there shouldn't be a space at the beginning or the end of the sentence!
 * <p>
 * <h2>Example</h2>
 * ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */
public class SmashWords {
    public static String smash(String... words) {
        return String.join(" ", words);
    }
}
