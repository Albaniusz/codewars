package com.codewars.kyu7.sortOutTheMenFromBoys;

import java.util.Collections;
import java.util.stream.IntStream;

/**
 * Scenario
 * <p>
 * Now that the competition gets tough it will Sort out the men from the boys .
 * <p>
 * Men are the Even numbers and Boys are the odd
 * <p>
 * Task
 * <p>
 * Given an array/list [] of n integers , Separate The even numbers from the odds , or Separate the men from the boys
 * <p>
 * Notes
 * <ul>
 * <li>Return an array/list where Even numbers come first then odds</li>
 * <li>Since , Men are stronger than Boys , Then Even numbers in ascending order While odds in descending .</li>
 * <li>Array/list size is at least 4 .</li>
 * <li>Array/list numbers could be a mixture of positives , negatives .</li>
 * <li>Have no fear , It is guaranteed that no Zeroes will exists .</li>
 * <li>Repetition of numbers in the array/list could occur , So (duplications are not included when separating).</li>
 * </ul>
 * Input >> Output Examples:
 * <p>
 * menFromBoys ({7, 3 , 14 , 17}) ==> return ({14, 17, 7, 3})
 * <p>
 * Explanation:
 * <ul>
 * <li>Since , { 14 } is the even number here , So it came first , then the odds in descending order {17 , 7 , 3} .</li>
 * </ul>
 * <p>
 * menFromBoys ({-94, -99 , -100 , -99 , -96 , -99 }) ==> return ({-100 , -96 , -94 , -99})
 * <p>
 * Explanation:
 * <ul>
 * <li>Since , { -100, -96 , -94 } is the even numbers here , So it came first in *ascending order *, then the odds in descending order { -99 }
 * <li>Since , (Duplications are not included when separating) , then you can see only one (-99) was appeared in the final array/list .
 * </ul>
 * menFromBoys ({49 , 818 , -282 , 900 , 928 , 281 , -282 , -1 }) ==> return ({-282 , 818 , 900 , 928 , 281 , 49 , -1})
 * <p>
 * Explanation:
 * <ul>
 * <li>Since , {-282 , 818 , 900 , 928 } is the even numbers here , So it came first in ascending order , then the odds in descending order { 281 , 49 , -1 }</li>
 * <li>Since , (Duplications are not included when separating) , then you can see only one (-282) was appeared in the final array/list .</li>
 * </ul>
 */
public class Kata {
    public static int[] menFromBoys(final int[] values) {
        IntStream evenStream = IntStream.of(values)
            .filter(i -> i % 2 == 0)
            .distinct()
            .sorted();

        IntStream oddStream = IntStream.of(values)
            .filter(i -> i % 2 != 0)
            .distinct()
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(i -> i);

        return IntStream.concat(evenStream, oddStream).toArray();
    }
}
