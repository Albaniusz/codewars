package com.codewars.kyu8.enumerableMagic.trueForAll;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * Task<br/>
 * Create a method all which takes two params:
 * <p>
 * a sequence<br/>
 * a function (function pointer in C)<br/>
 * and returns true if the function in the params returns true for every element in the sequence. Otherwise, it
 * should return false. If the sequence is empty, it should return true, since technically nothing failed the test.
 * <p>
 * Example<br/>
 * all((1, 2, 3, 4, 5), greater_than_9) -> false<br/>
 * all((1, 2, 3, 4, 5), less_than_9)    -> True<br/>
 * Help<br/>
 * Here's a (Ruby) resource if you get stuck:
 * <p>
 * http://www.rubycuts.com/enum-all
 */
public class Solution {
    public static boolean all(int[] list, IntPredicate predicate) {
        return Arrays.stream(list)
            .boxed()
            .map(predicate::test)
            .filter(item -> !item)
            .findAny()
            .orElse(true);
    }
}
