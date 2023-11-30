package com.codewars.kyu8.beConcise.theTernaryOperator;

/**
 * Be Concise I - The Ternary Operator
 * You are given a function describeAge / describe_age that takes a parameter age (which will always be a positive
 * integer) and does the following:
 * <p>
 * If the age is 12 or lower, it return "You're a(n) kid"<br/>
 * If the age is anything between 13 and 17 (inclusive), it return "You're a(n) teenager"<br/>
 * If the age is anything between 18 and 64 (inclusive), it return "You're a(n) adult"<br/>
 * If the age is 65 or above, it return "You're a(n) elderly"<br/>
 * Your task is to shorten the code as much as possible. Note that submitting the given code will not work because
 * there is a character limit of 137.
 * <p>
 * I'll give you a few hints:
 * <p>
 * The title itself is a hint - if you're not sure what to do, always research any terminology in this description
 * that you have not heard of!<br/>
 * Don't you think the whole "You're a(n) <insert_something_here>" is very repetitive? ;) Perhaps we can shorten it?<br/>
 * Write everything in one line, \n and other whitespaces counts.<br/>
 * Whatever you do, do not change what the function does. Good luck :)
 */
public class C {
    public static String describeAge(int a) {
        String x = "You're a(n) ";
        return a > 64 ? x + "elderly" : a > 17 ? x + "adult" : a > 12 ? x + "teenager" : x + "kid";
    }
}
