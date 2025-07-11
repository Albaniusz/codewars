package com.codewars.kyu8.drinkAbout;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrinksTest {
    private static void doTest(int age, String expected) {
        assertEquals(expected, Drinks.peopleWithAgeDrink(age),
            "peopleWithAgeDrink(" + age + ") returned an incorrect result.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(13, "drink toddy");
        doTest(14, "drink coke");
        doTest(16, "drink coke");
        doTest(17, "drink coke");
        doTest(18, "drink beer");
        doTest(20, "drink beer");
        doTest(21, "drink whisky");
        doTest(30, "drink whisky");
    }
}
