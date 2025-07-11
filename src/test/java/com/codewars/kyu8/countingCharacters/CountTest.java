package com.codewars.kyu8.countingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTest {
    @Test
    void test_some_characters() {
        assertEquals(3, Count.countCharOccurrences("missippi", 'i'));
        assertEquals(2, Count.countCharOccurrences("feed", 'e'));
    }

    @Test
    void test_all_characters() {
        assertEquals(8, Count.countCharOccurrences("aaaaaaaa", 'a'));
    }

    @Test
    void test_no_characters() {
        assertEquals(0, Count.countCharOccurrences("quicksilver", 'z'));
    }
}
