package com.codewars.kyu7.supernatural;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author isvorcz
 */
public class SupernaturalTest {

    /**
     * Test of bob method, of class Supernatural.
     */
    @Test
    public void testBob() {
        assertEquals("vampire", "Behead it with a machete, idjits!", Supernatural.bob("vampire"));
        assertEquals("pagan god", "It depends on which one it is, idjits!", Supernatural.bob("pagan god"));
        assertEquals("werepuppy", "I have friggin no idea yet, idjits!", Supernatural.bob("I have friggin no idea yet, idjits!"));
    }
}
