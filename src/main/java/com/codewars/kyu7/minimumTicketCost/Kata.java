package com.codewars.kyu7.minimumTicketCost;

import java.util.ArrayList;
import java.util.List;

/**
 * A few years ago, Aaron left his old school and registered at another due to security reasons. Now he wishes
 * to find Jane, one of his schoolmates and good friends.
 * <p>
 * There are n schools numbered from 1 to n. One can travel between each pair of schools by buying a ticket. The ticket
 * between schools i and j costs (i + j) modulo (n + 1) and can be used multiple times. Help Aaron find the minimum
 * total cost to visit all schools. He can start and finish at any school.
 * <p>
 * Range : 1 ≤ n ≤ 10<sup>6</sup>
 */
public class Kata {
    public static int findJane(final int n) {
        int result = 0;

        List<Integer> prices = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            prices.add((i + i + 1) % (n + 1));
        }

        return result;
    }
}
