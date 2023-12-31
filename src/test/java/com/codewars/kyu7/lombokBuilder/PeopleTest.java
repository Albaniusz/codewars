package com.codewars.kyu7.lombokBuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeopleTest {

    @Test
    public void testSample() {
        People person = People.builder().name("Adam").lastName("Savage").age(25).city("San Francisco").job("Unchained Reaction").build();
        assertEquals(
            "Adam",
            person.getName()
        );
        assertEquals(
            "hello my name is Adam",
            person.greet()
        );
    }
}
