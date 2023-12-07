package com.codewars.kyu7.javaFunctionalProgramming.theBeginning;

import java.util.function.Function;

/**
 * With the release of Java 8, Java has finally added support for "lambda functions", that is, variables that contain
 * a function which can operate on data just as class methods can (well, not just as class methods can...)
 * <p>
 * Coming from most scripting languages (e.g., Javascript, Python, Ruby), the concept of functions that can be passed
 * as variables should not be anything new. The syntax in Java should even look familiar:
 * <p>
 * Function<MyObject, String> f = p -> p.toString();<br/>
 * String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString
 * <p>
 * The above is a simple mapper function: given an input of type MyObject, return a specific result of type String,
 * in this case the toString of the object. They can, of course, become much more complicated.
 * <p>
 * A full listing of the default function types can be found at <a href="http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html</a>
 * <p>
 * Given this POJO:
 * <p>
 * public class Student {<br/>
 * private final String firstName;<br/>
 * private final String lastName;<br/>
 * public final String studentNumber;<br/>
 * public String getFullName() {<br/>
 * return firstName + " " + lastName;<br/>
 * }<br/>
 * public String getCommaName() {<br/>
 * return lastName + ", " + firstName;<br/>
 * }<br/>
 * }
 * <p>
 * Write a Function (with the appropriate types) that returns true if a given student is "John Smith" with a student
 * number of "js123" (otherwise return false).
 */
public class FunctionalProgramming {
    public static Function<Student, Boolean> f = p -> "John Smith".equals(p.getFullName()) && "js123".equals(p.studentNumber);
}
