package com.codewars.kyu7.fixme.letsSplitThisJoint;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DinglemouseTest {

    private static String[] show(final String[] ary) {
        System.out.println(Arrays.toString(ary));
        return ary;
    }

    @Test
    public void example() {
        assertEquals(new String[]{"a", "b", "c"}, show(Dinglemouse.split("a.b.c")));
    }

    @Test
    public void emptyArray() {
        assertEquals(new String[]{}, show(Dinglemouse.split("")));
    }

    @Test
    public void emptyItem() {
        assertEquals(new String[]{"a", "", "c"}, show(Dinglemouse.split("a..c")));
    }

    @Test
    public void emptyDotStart() {
        assertEquals(new String[]{"", "a"}, show(Dinglemouse.split(".a")));
    }

    @Test
    public void emptyDotEnd() {
        assertEquals(new String[]{"a", ""}, show(Dinglemouse.split("a.")));
    }

    @Test
    public void noSeparators() {
        assertEquals(new String[]{"abc"}, show(Dinglemouse.split("abc")));
    }
}
