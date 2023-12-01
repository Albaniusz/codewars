package com.codewars.kyu8.upAndDownStringGrows;

/**
 * Many programming languages provide the functionality of converting a string to uppercase or lowercase. For example,
 * upcase/downcase in Ruby, upper/lower in Python, and toUpperCase/toLowerCase in Java/JavaScript, uppercase/lowercase
 * in Kotlin. Typically, these methods won't change the size of the string.
 * <p>
 * For example, in Ruby, str.upcase.downcase.size == str.size is true for most cases.
 * <p>
 * However, in some special cases, the length of the transformed string may be longer than the original. Can you find
 * a string that satisfies this criteria?
 * <p>
 * For example, in Ruby, That means str.upcase.downcase.size > str.size
 * <p>
 * You should just set the value of STRANGE_STRING to meet the previous criteria.
 * <p>
 * Note: Meta programming is not allowed in this kata. So, the size of your solution is limited.
 */
public class StrangeString {
    static final String STRANGE_STRING = "ß";
}
