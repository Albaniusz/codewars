package com.codewars.kyu8.removeStringSpaces;

/**
 * Write a function that removes the spaces from the string, then return the resultant string.
 * <p>
 * Examples:
 * <p>
 * Input -> Output<br/>
 * "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"<br/>
 * "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"<br/>
 * "8aaaaa dddd r     " -> "8aaaaaddddr"
 */
public class Kata {
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
