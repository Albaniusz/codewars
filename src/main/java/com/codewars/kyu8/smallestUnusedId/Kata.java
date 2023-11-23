package com.codewars.kyu8.smallestUnusedId;

import java.util.Arrays;
import java.util.List;

/**
 * Hey awesome programmer!
 * <p>
 * You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!
 * <p>
 * Therefore you need a method, which returns the smallest unused ID for your next new data item...
 * <p>
 * Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, but you don't have
 * to find or remove them!
 * <p>
 * Go on and code some pure awesomeness!
 */
public class Kata {
    public static int nextId(int[] ids) {
        List<Integer> ints = Arrays.stream(ids).boxed().toList();

        int id = 0;
        while (ints.contains(id)) {
            id++;
        }

        return id;
    }
}
