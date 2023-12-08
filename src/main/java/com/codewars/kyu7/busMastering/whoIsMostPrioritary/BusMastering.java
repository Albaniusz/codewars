package com.codewars.kyu7.busMastering.whoIsMostPrioritary;

/**
 * When multiple master devices are connected to a single bus (<a href="https://en.wikipedia.org/wiki/System_bus">https://en.wikipedia.org/wiki/System_bus</a>), there needs
 * to be an arbitration in order to choose which of them can have access to the bus (and 'talk' with a slave).
 * <p>
 * We implement here a very simple model of bus mastering. Given n, a number representing the number of masters
 * connected to the bus, and a fixed priority order (the first master has more access priority than the second
 * and so on...), the task is to choose the selected master. In practice, you are given a string inp of length
 * n representing the n masters' requests to get access to the bus, and you should return a string representing
 * the masters, showing which (only one) of them was granted access:
 * <p>
 * The string 1101 means that master 0, master 1 and master 3 have requested access to the bus.
 * <p>
 * Knowing that master 0 has the greatest priority, the output of the function should be: 1000
 * <p>
 * Examples
 * <ul>
 * <li>arbitrate("001000101", 9) -> "001000000"</li>
 * <li>arbitrate("000000101", 9) -> "000000100"</li>
 * </ul>
 * Notes
 * <p>
 * The resulting string (char* ) should be allocated in the arbitrate function, and will be free'ed in the tests.
 * <p>
 * n is always greater or equal to 1.
 */
public class BusMastering {
    public static String arbitrate(String input, int n) {
        char[] chars = input.toCharArray();
        char[] results = new char[n];
        boolean first = true;

        for (int i = 0; i < n; i++) {
            if (chars[i] == '1' && first) {
                results[i] = '1';
                first = false;
            } else {
                results[i] = '0';
            }
        }

        return String.valueOf(results);
    }
}
