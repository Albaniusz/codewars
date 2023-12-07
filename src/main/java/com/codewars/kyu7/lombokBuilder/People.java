package com.codewars.kyu7.lombokBuilder;

import lombok.Builder;
import lombok.Getter;

/**
 * Having this class:
 * <p>
 * public class People{<br/>
 * public int age;<br/>
 * public String name;<br/>
 * public String lastName;<br/>
 * String GREET="hello";<br/>
 * <p>
 * public String greet(){<br/>
 * return GREET+" my name is "+name;<br/>
 * }<br/>
 * }
 * <p>
 * We want to:
 * <ul>
 * <li>Encapsulate properly the class by providing read accessors (setters are not required for this Kata).</li>
 * <li>Implement the Builder design Pattern.</li>
 * <li>Additionally we have allegedly a JIT compiler and we want to do some micro-optimization by marking constants in the code.</li>
 * </ul>
 * Constants
 * <p>
 * In Java, constants are creating by adding the final keyword, but only primitives are true constants if we have
 * objects that are not primitives marked as constants they actually have their memory location constant, not
 * the values. It's pretty useful to optimize memory in JIT compilers since they can actually reserve memory before
 * we use the variables and having the confidence in that their memory locations will not be changed through the scope.
 * <p>
 * Builder Design Pattern
 * <p>
 * This design pattern help us create instances of the object by specifying all of the data in (Dementor) chain
 * of calls style in any order. The object creation is optimized by creating the instance only when the build method
 * is called. If we call a method twice in the builder the value of the field will be the second setted.
 * <p>
 * Note: If you don't use Lombok for this Kata ensure proper naming conventions are followed.
 */

@Getter
@Builder
public class People {

    private int age;

    private String name;

    private String lastName;

    private String city;

    private String job;

    private final static String GREET = "hello";

    public String greet() {
        return GREET + " my name is " + name;
    }
}
