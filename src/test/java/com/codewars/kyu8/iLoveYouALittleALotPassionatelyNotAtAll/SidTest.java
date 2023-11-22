package com.codewars.kyu8.iLoveYouALittleALotPassionatelyNotAtAll;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SidTest {
    @Test
    public void test1() {
        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
    }
    @Test
    public void test2() {
        assertEquals("madly", Sid.howMuchILoveYou(17));
    }
    @Test
    public void test3() {
        assertEquals("not at all", Sid.howMuchILoveYou(48));
    }
    @Test
    public void test4() {
        assertEquals("a little", Sid.howMuchILoveYou(80));
    }
    @Test
    public void test5() {
        assertEquals("madly", Sid.howMuchILoveYou(155));
    }
}
