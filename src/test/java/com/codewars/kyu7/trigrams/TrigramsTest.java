package com.codewars.kyu7.trigrams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrigramsTest {
    @Test
    public void TrigramsShouldWork() {
        assertEquals("the he_ e_q _qu qui uic ick ck_ k_r _re red", Trigrams.trigrams("the quick red"));
    }

    @Test
    public void emptyStringForShortPhrase() {
        assertEquals("", Trigrams.trigrams("no"));
    }
}
