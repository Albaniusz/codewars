package com.codewars.kyu7.calculateMeanAndConcatenateString;

/**
 * You will be given an array which will include both integers and characters.
 * <p>
 * Return an array of length 2 with a[0] representing the mean of the ten integers as a floating point number. There
 * will always be 10 integers and 10 characters. Create a single string with the characters and return it as a[1] while
 * maintaining the original order.
 * <p>
 * lst = ['u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0']
 * <p>
 * Here is an example of your return
 * <p>
 * [3.6, "udiwstagwo"]
 * <p>
 * In C# and Java the mean return is a double.
 */
public class Kata {
    public static Object[] mean(char[] lst) {
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (char chr : lst) {
            if (chr < 58) {
                sum += chr - 48;
            } else {
                stringBuilder.append(chr);
            }
        }

        Object[] result = new Object[2];
        result[0] = sum / 10d;
        result[1] = stringBuilder.toString();

        return result;
    }
}
