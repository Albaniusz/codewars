package com.codewars.kyu8.usdCny;

import java.math.BigDecimal;

/**
 * Create a function that converts US dollars (USD) to Chinese Yuan (CNY) . The input is the amount of USD as an integer, and the output should be a string that states the amount of Yuan followed by 'Chinese Yuan'
 * <p>
 * Examples (Input -> Output)
 * <pre>
 * 15  -> '101.25 Chinese Yuan'
 * 465 -> '3138.75 Chinese Yuan'
 * </pre>
 * The conversion rate you should use is 6.75 CNY for every 1 USD. All numbers should be represented as a string with 2 decimal places. (e.g. "21.00" NOT "21.0" or "21")
 */
public class Kata {
    public static String usdcny(int usd) {
        return new BigDecimal(usd * 6.75).setScale(2, BigDecimal.ROUND_HALF_UP).toString() + " Chinese Yuan";
    }
}
