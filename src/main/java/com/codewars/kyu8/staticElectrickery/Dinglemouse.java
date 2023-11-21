package com.codewars.kyu8.staticElectrickery;

/**
 * The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.
 * <p>
 * But it's not working properly.
 * <p>
 * Task
 * Fix the code so we can all go home early.
 * <p>
 * Restrictions
 * Do not modify the constructor
 * Do not modify the plus100 method
 * Do not modify the ONE_HUNDRED declaration
 */
public class Dinglemouse {
    private static int ONE_HUNDRED = 100;

    public static final Dinglemouse INST = new Dinglemouse();

    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
