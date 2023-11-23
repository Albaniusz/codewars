package com.codewars.kyu8.ghostCode;

/**
 * Trollencio changed my code! can you fix it? My name is not "dumb!" o( TT_TT )o
 * <p>
 * Instructions: Fix the code<br/>
 * Input
 * <p>
 * Javatlacati
 * <p>
 * Output
 * <p>
 * Hello my name is Javatlacati
 * <p>
 * Input
 * <p>
 * ""
 * <p>
 * Output
 * <p>
 * Hello world!
 */
public class GhostCode {
    public static String helloName(final String name) {
        if (name == null || name.equals(""))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }
}
