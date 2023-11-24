package com.codewars.kyu8.findNumbersWhichAreDivisibleByGivenNumber;

import java.util.stream.IntStream;

/**
 * Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
 * First argument is an array of numbers and the second is the divisor.
 * <p>
 * Example(Input1, Input2 --> Output)<br/>
 * [1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]
 */
public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return IntStream.of(numbers)
            .filter(item -> item % divider == 0)
            .toArray();
    }
}
