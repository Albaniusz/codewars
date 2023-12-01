package com.codewars.kyu8.exclusiveOrXorLogicalOperator;

/**
 * <h2>Exclusive "or" (xor) Logical Operator</h2>
 * <h2>Overview</h2>
 * In some scripting languages like PHP, there exists a logical operator (e.g. &&, ||, and, or, etc.) called
 * the "Exclusive Or" (hence the name of this Kata). The exclusive or evaluates two booleans. It then returns true
 * if exactly one of the two expressions are true, false otherwise. For example:
 * <p>
 * false xor false == false // since both are false<br/>
 * true xor false == true // exactly one of the two expressions are true<br/>
 * false xor true == true // exactly one of the two expressions are true<br/>
 * true xor true == false // Both are true.  "xor" only returns true if EXACTLY one of the two expressions evaluate
 * to true.
 * <p>
 * <h2>Task</h2>
 * Since we cannot define keywords in Javascript (well, at least I don't know how to do it), your task is to define
 * a function xor(a, b) where a and b are the two expressions to be evaluated. Your xor function should have
 * the behaviour described above, returning true if exactly one of the two expressions evaluate to true,
 * false otherwise.
 */
public class XOR {
    public static boolean xor(boolean a, boolean b) {
        return a != b;
    }
}
