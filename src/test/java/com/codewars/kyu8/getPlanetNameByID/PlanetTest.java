package com.codewars.kyu8.getPlanetNameByID;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanetTest {
    private void doTest(int id, String expected) {
        String actual = Planet.getPlanetName(id);
        assertEquals(expected, actual, "for id = " + id);
    }

    @Test
    void exampleTests() {
        doTest(2, "Venus");
        doTest(5, "Jupiter");
        doTest(3, "Earth");
    }
}
