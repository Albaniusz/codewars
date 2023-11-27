package com.codewars.kyu8.kataExampleTwist;

/**
 * This is an easy twist to the example kata (provided by Codewars when learning how to create your own kata).
 * <p>
 * Add the value "codewars" to the array websites 1,000 times.
 */
public class KataExampleTwist {
    public static String[] kataExampleTwist() {
        String[] strings = new String[1000];

        for (int i = 0; i < 1000; i++) {
            strings[i] = "codewars";
        }

        return strings;
    }
}
