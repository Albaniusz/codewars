package com.codewars.kyu7.simpleArrayProduct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(8, Solution.solve(new int[][]{{1, 2}, {3, 4}}));
        assertEquals(45, Solution.solve(new int[][]{{10, -15}, {-1, -3}}));
        assertEquals(12, Solution.solve(new int[][]{{-1, 2, -3, 4}, {1, -2, 3, -4}}));
        assertEquals(17600, Solution.solve(new int[][]{{-11, -6}, {-20, -20}, {18, -4}, {-20, 1}}));
        assertEquals(3584, Solution.solve(new int[][]{{14, 2}, {0, -16}, {-12, -16}}));
        assertEquals(12, Solution.solve(new int[][]{{-3, -4}, {1, 2, -3}}));
        assertEquals(-40, Solution.solve(new int[][]{{-2, -15, -12, -8, -16}, {-4, -15, -7}, {-10, -5}}));
    }
}
