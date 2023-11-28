package com.codewars.kyu8.getNthEvenNumber;

/**
 * Return the Nth Even Number
 * <p>
 * Example(Input --> Output)
 * <p>
 * 1 --> 0 (the first even number is 0)<br/>
 * 3 --> 4 (the 3rd even number is 4 (0, 2, 4))<br/>
 * 100 --> 198<br/>
 * 1298734 --> 2597466
 * <p>
 * The input will not be 0.
 */
public class Num {
    public static int nthEven(int n) {
        return --n * 2;
    }
}
