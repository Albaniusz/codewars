package com.codewars.kyu7.eanValidation;

import java.util.stream.IntStream;

/**
 * A lot of goods have an International Article Number (formerly known as "European Article Number") abbreviated "EAN". EAN is a 13-digits barcode consisting of 12-digits data followed by a single-digit checksum (EAN-8 is not considered in this kata).
 * <p>
 * The single-digit checksum is calculated as followed (based upon the 12-digit data):
 * <ul>
 * <li>The digit at the first, third, fifth, etc. position (i.e. at the odd position) has to be multiplied with "1".</li>
 * <li>The digit at the second, fourth, sixth, etc. position (i.e. at the even position) has to be multiplied with "3".</li>
 * <li>Sum these results.</li>
 * </ul>
 * If this sum is dividable by 10, the checksum is 0. Otherwise the checksum has the following formula:
 * <p>
 * checksum = 10 - (sum mod 10)
 * <p>
 * For example, calculate the checksum for "400330101839" (= 12-digits data):
 * <p>
 * 4·1 + 0·3 + 0·1 + 3·3 + 3·1 + 0·3 + 1·1 + 0·3 + 1·1 + 8·3 + 3·1 + 9·3 = 4 + 0 + 0 + 9 + 3 + 0 + 1 + 0 + 1 + 24
 * + 3 + 27 = 72
 * <p>
 * 10 - (72 mod 10) = 8 ⇒ Checksum: 8
 * <p>
 * Thus, the EAN-Code is 4003301018398 (= 12-digits data followed by single-digit checksum).
 * <p>
 * Your Task
 * <p>
 * Validate a given EAN-Code. Return true if the given EAN-Code is valid, otherwise false.
 * <p>
 * Assumption
 * <p>
 * You can assume the given code is syntactically valid, i.e. it only consists of numbers and it exactly has a length of 13 characters.
 * <p>
 * Examples
 * <p>
 * EANValidator.validate("4003301018398") // true<br/>
 * EANValidator.validate("4003301018392") // false
 * <p>
 * Good Luck and have fun.
 */
public class EANValidator {
    private static final int ASCII_ZERO = 48;

    public static boolean validate(final String eanCode) {
        char[] eanChars = eanCode.toCharArray();

        int checkNumber = eanChars[eanChars.length - 1] - ASCII_ZERO;
        int checkSum = IntStream.rangeClosed(0, 11)
            .map(i -> (eanChars[i] - ASCII_ZERO) * (i % 2 == 0 ? 1 : 3))
            .sum();

        return checkNumber == (checkSum % 10 == 0 ? 0 : 10 - (checkSum % 10));
    }
}
