package com.codewars.kyu8.exclamationMarksSeries.removeAllExclamationMarksFromSentenceButEnsureExclamationMarkAtEndOfString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    void sampleTests() {
        assertEquals("Hi!", Kata.remove("Hi!"), "For input \"Hi!\"");
        assertEquals("Hi!", Kata.remove("Hi!!!"), "For input \"Hi!!!\"");
        assertEquals("Hi!", Kata.remove("!Hi"), "For input \"!Hi\"");
        assertEquals("Hi!", Kata.remove("!Hi!"), "For input \"!Hi!\"");
        assertEquals("Hi Hi!", Kata.remove("Hi! Hi!"), "For input \"Hi! Hi!\"");
        assertEquals("Hi!", Kata.remove("Hi"), "For input \"Hi\"");
    }
}
