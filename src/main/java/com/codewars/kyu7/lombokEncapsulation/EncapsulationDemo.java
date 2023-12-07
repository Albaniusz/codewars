package com.codewars.kyu7.lombokEncapsulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * In Java, we have a very powerful library named Lombok. It helps to reduce the boilerplate code.
 * <p>
 * This Kata is a challenge created for you to learn how to use <a href="https://projectlombok.org/">lombok</a>.
 * <p>
 * Giving the following class:
 * <p>
 * public class EncapsulationDemo{<br/>
 * public int number;<br/>
 * public String stringValue;<br/>
 * public Object anObject;<br/>
 * }
 * <p>
 * We have to do the following modifications to properly encapsulate info:
 * <ul>
 * <li>make fields private</li>
 * <li>provide accessors to the internal fields ( setters/getters )</li>
 * <li>provide an empty constructor to support Java Beans specification</li>
 * <li>Add a constructor that can receive parameters for all of the fields</li>
 * <p>
 * Note: make sure if you don't use Lombok to enforce proper naming conventions.
 * <p>
 * If you want a harder version please try: <a href="https://www.codewars.com/kata/5e5cc5aa6760d70036ea6d22/java">Lombok Encapsulation II</a>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EncapsulationDemo {

    private int number;

    private String stringValue;

    private Object anObject;
}
