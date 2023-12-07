package com.codewars.kyu7.batmanQuotes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatmanQuotesTest {

    static String[] quotes = {"Quote Hidden in example test",
        "Holy haberdashery, Batman!",
        "Quote Hidden in example test"
    };

    @Test
    public void test1() {
        assertEquals("Fail", "Robin: Holy haberdashery, Batman!", BatmanQuotes.getQuote(quotes, "Rob1n"));
    }
}
