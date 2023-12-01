package com.codewars.kyu8.collatzConjecture;

/**
 * The Collatz conjecture (also known as 3n+1 conjecture) is a conjecture that applying the following algorithm
 * to any number we will always eventually reach one:
 * <p>
 * [This is writen in pseudocode]<br/>
 * if(number is even) number = number / 2<br/>
 * if(number is odd) number = 3*number + 1
 * <p>
 * #Task
 * <p>
 * Your task is to make a function hotpo that takes a positive n as input and returns the number of times you need
 * to perform this algorithm to get n = 1.
 * <p>
 * #Examples
 * <p>
 * hotpo(1) returns 0<br/>
 * (1 is already 1)
 * <p>
 * hotpo(5) returns 5<br/>
 * 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * <p>
 * hotpo(6) returns 8<br/>
 * 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * <p>
 * hotpo(23) returns 15<br/>
 * 23 -> 70 -> 35 -> 106 -> 53 -> 160 -> 80 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * <p>
 * #References
 * <p>
 * Collatz conjecture wikipedia page: <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">https://en.wikipedia.org/wiki/Collatz_conjecture</a>
 */
public class CollatzConjecture {
    public static int hotpo(int n) {
        int counter = 0;

        while (n > 1) {
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            counter++;
        }

        return counter;
    }
}
