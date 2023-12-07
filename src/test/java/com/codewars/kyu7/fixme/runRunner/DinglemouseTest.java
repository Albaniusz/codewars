package com.codewars.kyu7.fixme.runRunner;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DinglemouseTest {

    @Test
    public void test() {
        Dinglemouse.runRunners();
        assertTrue("Sorry, try again :-(", ThreadUtil.checkThreads());
    }

}
