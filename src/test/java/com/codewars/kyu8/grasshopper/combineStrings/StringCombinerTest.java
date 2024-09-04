package com.codewars.kyu8.grasshopper.combineStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCombinerTest {
    @Test
    void test() {
        assertEquals("James Stevens",
            StringCombiner.combineNames("James", "Stevens"));
    }
}
