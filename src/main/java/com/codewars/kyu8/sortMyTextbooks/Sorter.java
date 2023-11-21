package com.codewars.kyu8.sortMyTextbooks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream()
            .sorted(Comparator.comparing(String::intern, String.CASE_INSENSITIVE_ORDER))
            .collect(Collectors.toList());
    }
}
