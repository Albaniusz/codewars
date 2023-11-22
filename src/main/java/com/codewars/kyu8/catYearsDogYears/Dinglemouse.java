package com.codewars.kyu8.catYearsDogYears;

/**
 * Kata Task<br/>
 * I have a cat and a dog.
 * <p>
 * I got them at the same time as kitten/puppy. That was humanYears years ago.
 * <p>
 * Return their respective ages now as [humanYears,catYears,dogYears]
 * <p>
 * NOTES:
 * <p>
 * humanYears >= 1<br/>
 * humanYears are whole numbers only<br/>
 * Cat Years<br/>
 * 15 cat years for first year<br/>
 * +9 cat years for second year<br/>
 * +4 cat years for each year after that<br/>
 * Dog Years<br/>
 * 15 dog years for first year<br/>
 * +9 dog years for second year<br/>
 * +5 dog years for each year after that
 */
public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return new int[]{
            humanYears,
            humanYears == 1 ? 15 : humanYears == 2 ? 15 + 9 : 15 + 9 + (4 * (humanYears - 2)),
            humanYears == 1 ? 15 : humanYears == 2 ? 15 + 9 : 15 + 9 + (5 * (humanYears - 2)),
        };
    }
}
