package com.codewars.kyu8.abbreviateTwoWordName;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 * <p>
 * The output should be two capital letters with a dot separating them.
 * <p>
 * It should look like this:
 * <p>
 * Sam Harris => S.H<br/>
 * patrick feeney => P.F
 */
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
            .map(item -> item.toUpperCase().charAt(0))
            .map(String::valueOf)
            .collect(Collectors.joining("."));
    }
}
