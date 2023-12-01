package com.codewars.kyu8.findFirstNonConsecutiveNumber;

/**
 * Your task is to find the first element of an array that is not consecutive.
 * <p>
 * By not consecutive we mean not exactly 1 larger than the previous element of the array.
 * <p>
 * E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's
 * the first non-consecutive number.
 * <p>
 * If the whole array is consecutive then return null<sup>2</sup>.
 * <p>
 * The array will always have at least 2 elements<sup>1</sup> and all elements will be numbers. The numbers will also all
 * be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could
 * be either too!
 * <p>
 * If you like this Kata, maybe try this one next: <a href="https://www.codewars.com/kata/represent-array-of-numbers-as-ranges">https://www.codewars.com/kata/represent-array-of-numbers-as-ranges</a>
 * <p>
 * <sup>1</sup> Can you write a solution that will return null2 for both [] and [ x ] though? (This is an empty array
 * and one with a single number and is not tested for, but you can write your own example test. )
 * <p>
 * <sup>2</sup>
 * Swift, Ruby and Crystal: nil<br/>
 * Haskell: Nothing<br/>
 * Python, Rust, Scala: None<br/>
 * Julia: nothing<br/>
 * Nim: none(int) (See options)
 */
public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        Integer result = null;
        int lastOne = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != 0 && lastOne + 1 != array[i]) {
                result = array[i];
                break;
            }

            lastOne = array[i];
        }

        return result;
    }
}
