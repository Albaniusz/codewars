package com.codewars.kyu7.fixme1234;

import java.util.HashMap;
import java.util.Map;

/**
 * <h4>fixme1234</h4>
 * The code provided is supposed to simply return the named number as an integer.
 * <p>
 * But it's not working properly.
 * <h4>Task</h4>
 * Fix the bug so we can all go home early.
 * <h4>Notes</h4>
 * Don't try to modify the getNumber API. It returns an enum.
 */
public class Dinglemouse {
    private static final Map<String, MyNumber> cache = new HashMap<>();

    static enum MyNumber {
        ONE(1, "one", "ichi", "un"),
        TWO(2, "two", "ni", "deux"),
        THREE(3, "three", "san", "trois"),
        FOUR(4, "four", "shi", "quatre");

        private final int val;

        MyNumber(int val, String... names) {
            this.val = val;
            for (final String n : names) cache.put(n, this);
        }

        public int intValue() {
            return this.val;
        }
    }

    static MyNumber getNumber(final String name) {
        if (cache.isEmpty()) {
            MyNumber number = MyNumber.ONE;
        }
        return cache.get(name);
    }
}
