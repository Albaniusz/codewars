package com.codewars.kyu7.herdingCats;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CatWeightComparatorTest {
    @Test
    public void testSimpleCase() {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Lily", 30);
        cats[1] = new Cat("Drake", 15);
        cats[2] = new Cat("Zooz", 1);

        Arrays.sort(cats, new CatWeightComparator());

        assertEquals("Incorrect cat found at index 1", "Drake", cats[1].name);
        assertEquals("Incorrect cat found at index 2", "Lily", cats[2].name);
        assertEquals("Incorrect cat found at index 0", "Zooz", cats[0].name);
    }
}
