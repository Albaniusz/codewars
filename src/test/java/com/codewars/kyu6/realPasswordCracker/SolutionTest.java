package com.codewars.kyu6.realPasswordCracker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void test() {
        assertEquals("code", Solution.passwordCracker("e6fb06210fafc02fd7479ddbed2d042cc3a5155e"));
        assertEquals("test", Solution.passwordCracker("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3"));
    }
}
