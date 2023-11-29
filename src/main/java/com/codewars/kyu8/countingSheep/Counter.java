package com.codewars.kyu8.countingSheep;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts
 * the number of sheep present in the array (true means present).
 * <p>
 * For example,
 * <p>
 * [true,  true,  true,  false,<br/>
 * true,  true,  true,  true ,<br/>
 * true,  false, true,  false,<br/>
 * true,  false, false, true ,<br/>
 * true,  true,  true,  true ,<br/>
 * false, false, true,  true]
 * <p>
 * The correct answer would be 17.
 * <p>
 * Hint: Don't forget to check for bad values like null/undefined
 */
public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Stream.of(arrayOfSheeps)
            .filter(Objects::nonNull)
            .filter(item -> item)
            .count();
    }
}
