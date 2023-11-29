package com.codewars.kyu8.nameOnBillboard;

/**
 * You can print your name on a billboard ad. Find out how much it will cost you. Each character has a default price
 * of £30, but that can be different if you are given 2 parameters instead of 1 (allways 2 for Java).
 * <p>
 * You can not use multiplier "*" operator.
 * <p>
 * If your name would be Jeong-Ho Aristotelis, ad would cost £600. 20 leters * 30 = 600 (Space counts as a character).
 */
public class Billboard {
    public static int billboard(String name, int price) {
        int result = 0;

        for (char chr : name.toCharArray()) {
            result += price;
        }

        return result;
    }
}
