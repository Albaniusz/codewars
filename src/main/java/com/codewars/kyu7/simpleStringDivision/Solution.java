package com.codewars.kyu7.simpleStringDivision;

/**
 * In this Kata, you will be given a number in form of a string and an integer k and your task is to insert k commas
 * into the string and determine which of the partitions is the largest.
 * <p>
 * For example:
 * <p>
 * solve('1234',1) = 234 because ('1','234') or ('12','34') or ('123','4').<br/>
 * solve('1234',2) = 34 because ('1','2','34') or ('1','23','4') or ('12','3','4').<br/>
 * solve('1234',3) = 4<br/>
 * solve('2020',1) = 202
 * <p>
 * More examples in test cases. Good luck!
 * <p>
 * Please also try <a href="https://www.codewars.com/kata/5ba38ba180824a86850000f7">Simple remove duplicates</a>
 */
public class Solution {
    public static long solve(String st, int k) {
        int max = 0;
        int size = st.length() - k;

        for (int i = 0; i <= st.length() - size; i++) {
            int candidate = Integer.parseInt(st.substring(i, i + size));
            if (max < candidate) {
                max = candidate;
            }
        }

        return max;
    }
}
