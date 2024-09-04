package com.codewars.kyu6.the80sKids.legendsOfTheHiddenTemple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightiesKids4Test {

    @Test
    public void test1() {
        assertEquals("X       X\n  X   X\n    X\n  X   X\nX       X\n", EightiesKids4.markSpot(5));
    }

    @Test
    public void test2() {
        assertEquals("X\n", EightiesKids4.markSpot(1));
    }

    @Test
    public void test3() {
        assertEquals("X                   X\n  X               X\n    X           X\n      X       X\n        X   X\n          X\n        X   X\n      X       X\n    X           X\n  X               X\nX                   X\n", EightiesKids4.markSpot(11));
    }

    @Test
    public void test4() {
        assertEquals("?", EightiesKids4.markSpot(-1));
    }

    @Test
    public void test5() {
        assertEquals("?", EightiesKids4.markSpot(0.5f));
    }

    @Test
    public void test6() {
        assertEquals("?", EightiesKids4.markSpot(1.9f));
    }
}

