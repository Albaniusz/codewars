package com.codewars.kyu8.unfinishedLoop;

import java.util.ArrayList;
import java.util.List;

/**
 * Unfinished Loop - Bug Fixing #1
 * <p>
 * Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!
 */
public class Kata {
    public static List CreateList(int number) {
        List list = new ArrayList();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}
