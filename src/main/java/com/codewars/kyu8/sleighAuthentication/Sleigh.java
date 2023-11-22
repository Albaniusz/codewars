package com.codewars.kyu8.sleighAuthentication;

/**
 * Christmas is coming and many people dreamed of having a ride with Santa's sleigh. But, of course, only Santa himself
 * is allowed to use this wonderful transportation. And in order to make sure, that only he can board the sleigh,
 * there's an authentication mechanism.
 * <p>
 * Your task is to implement the authenticate() method of the sleigh, which takes the name of the person, who wants
 * to board the sleigh and a secret password. If, and only if, the name equals "Santa Claus" and the password
 * is "Ho Ho Ho!" (yes, even Santa has a secret password with uppercase and lowercase letters and special
 * characters :D), the return value must be true. Otherwise it should return false.
 * <p>
 * Examples:
 * <p>
 * sleigh.authenticate("Santa Claus", "Ho Ho Ho!") # must return True<br/>
 * sleigh.authenticate("Santa', 'Ho Ho Ho!") # must return False<br/>
 * sleigh.authenticate("Santa Claus", "Ho Ho!") # must return False<br/>
 * sleigh.authenticate("jhoffner", "CodeWars") # Nope, even Jak
 */
public class Sleigh {
    public static Boolean authenticate(String name, String password) {
        return "Santa Claus".equals(name) && "Ho Ho Ho!".equals(password);
    }
}
