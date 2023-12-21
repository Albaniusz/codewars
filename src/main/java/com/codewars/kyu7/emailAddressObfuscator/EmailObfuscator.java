package com.codewars.kyu7.emailAddressObfuscator;

/**
 * Many people choose to obfuscate their email address when displaying it on the Web. One common way of doing this is by substituting the @ and . characters for their literal equivalents in brackets.
 * <p>
 * Example 1:
 * <p>
 * user_name@example.com<br/>
 * => user_name [at] example [dot] com
 * <p>
 * Example 2:
 * <p>
 * af5134@borchmore.edu<br/>
 * => af5134 [at] borchmore [dot] edu
 * <p>
 * Example 3:
 * <p>
 * jim.kuback@ennerman-hatano.com<br/>
 * => jim [dot] kuback [at] ennerman-hatano [dot] com
 * <p>
 * Using the examples above as a guide, write a function that takes an email address string and returns the obfuscated version as a string that replaces the characters @ and . with [at] and [dot], respectively.
 * <p>
 * Notes
 * <ul>
 * <li>Input (email) will always be a string object. Your function should return a string.</li>
 * <li>Change only the @ and . characters.</li>
 * <li>Email addresses may contain more than one . character.</li>
 * <li>Note the additional whitespace around the bracketed literals in the examples!</li>
 * </ul>
 */
public class EmailObfuscator {
    public static String obfuscate(String email) {
        return email.replace("@", " [at] ").replace(".", " [dot] ");
    }
}
