package com.codewars.kyu8.ifYouCantSleepJustCountSheep;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * If you can't sleep, just count sheep!!
 * <p>
 * Task:
 * <p>
 * Given a non-negative integer, 3 for example, return a string with a murmur:<br/>
 * "1 sheep...2 sheep...3 sheep...".<br/>
 * Input will always be valid, i.e. no negative integers.
 */
public class Kata {
    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num)
            .mapToObj(item -> item + " sheep...")
            .collect(Collectors.joining());
    }
}
