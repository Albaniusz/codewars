package com.codewars.kyu7.javaFunctionalProgramming.multilineFunctions;

import java.util.function.ToDoubleFunction;

/**
 * With the release of Java 8, Java has finally added support for "lambda functions", that is, variables that contain
 * a function which can operate on data just as class methods can (well, not just as class methods can...)
 * <p>
 * Let's learn about lambdas.
 * <p>
 * Last time, we did something similar to this:
 * <p>
 * Function<MyObject, String> f = p -> p.toString();<br/>
 * String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString
 * <p>
 * But what if we need more than one line in our function for the calculations? The syntax to do so is to enclose the function's commands in curly brackets and include a return statement:
 * <p>
 * Function<MyObject, String> f = p -> {StringBuffer out = new StringBuffer();<br/>
 * out.append(p.getName());<br/>
 * out.append(MyObject.getStaticName());<br/>
 * out.append("Constant message");<br/>
 * return out.toString();<br/>
 * };
 * <p>
 * Given this POJO:
 * <p>
 * public class Triangle {<br/>
 * public final int height;<br/>
 * public final int base;<br/>
 * private double area;<br/>
 * public void setArea(double a) {<br/>
 * area = a;<br/>
 * }<br/>
 * public double getArea() {<br/>
 * return area;<br/>
 * }<br/>
 * }
 * <p>
 * Write a function that sets the area of the given Triangle and returns the area as a double. Do not use the function
 * type Function; there is a function type for converting an arbitrary class into a double, use that.
 * <p>
 * The formula for triangle area is: 1/2 * base * height
 * <p>
 * Assume valid input (base and height are both greater than 0).
 * <p>
 * A full listing of the default function types can be found at <a href="http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html</a>
 * <p>
 * (Aside: you may have noticed, the function type we should have used in Part 1 is Predicate, even though we used Function.)
 */
public class FunctionalProgramming {
    public static ToDoubleFunction<Triangle> f = t -> {
        double area = t.base * t.height / 2d;
        t.setArea(area);
        return area;
    };
}
