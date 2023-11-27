package com.codewars.kyu8.multiplicationTableForNumber;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Your goal is to return multiplication table for number that is always an integer from 1 to 10.
 * <p>
 * For example, a multiplication table (string) for number == 5 looks like below:
 * <p>
 * 1 * 5 = 5<br/>
 * 2 * 5 = 10<br/>
 * 3 * 5 = 15<br/>
 * 4 * 5 = 20<br/>
 * 5 * 5 = 25<br/>
 * 6 * 5 = 30<br/>
 * 7 * 5 = 35<br/>
 * 8 * 5 = 40<br/>
 * 9 * 5 = 45<br/>
 * 10 * 5 = 50
 * <p>
 * P. S. You can use \n in string to jump to the next line.
 * <p>
 * Note: newlines should be added between rows, but there should be no trailing newline at the end. If you're unsure
 * about the format, look at the sample tests.
 */
public class Kata {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
            .boxed()
            .map(i -> i + " * " + num + " = " + (num * i))
            .collect(Collectors.joining("\n"));
    }
}
