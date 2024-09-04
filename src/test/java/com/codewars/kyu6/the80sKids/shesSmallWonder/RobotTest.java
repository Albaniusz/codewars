package com.codewars.kyu6.the80sKids.shesSmallWonder;

import com.codewars.kyu6.shesSmallWonder.Robot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {
    private Robot vicky;

    @Before
    public void setUp() {
        vicky = new Robot();
    }

    @After
    public void tearDown() {
        vicky = null;
    }

    @Test
    public void simpleTest() {
        assertEquals("Thank you for teaching me hello", vicky.learnWord("hello"));
        assertEquals("Thank you for teaching me world", vicky.learnWord("world"));
        assertEquals("Thank you for teaching me goodbye", vicky.learnWord("goodbye"));
        assertEquals("I already know the word world", vicky.learnWord("world"));
        assertEquals("I already know the word World", vicky.learnWord("World"));
    }

    @Test
    public void funnyWords() {
        assertEquals("Thank you for teaching me INPuT", vicky.learnWord("INPuT"));
        assertEquals("I already know the word INPuT", vicky.learnWord("INPuT"));
    }

    @Test
    public void otherFunnyWords() {
        assertEquals("Thank you for teaching me TEAcHING", vicky.learnWord("TEAcHING"));
        assertEquals("I already know the word TEAcHING", vicky.learnWord("TEAcHING"));
        assertEquals("I already know the word teaChing", vicky.learnWord("teaChing"));
        assertEquals("I already know the word Teaching", vicky.learnWord("Teaching"));
    }
}
