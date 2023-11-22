package com.codewars.kyu8.reversedWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
