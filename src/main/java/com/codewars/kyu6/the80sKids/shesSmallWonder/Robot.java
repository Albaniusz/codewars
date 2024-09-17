package com.codewars.kyu6.the80sKids.shesSmallWonder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Vicky is quite the small wonder. Most people don't even realize she's not a real girl, but a robot living amongst us.
 * Sure, if you stick around her home for a while you might see her creator open up her back and make a few tweaks
 * and even see her recharge in the closet instead of sleeping in a bed.
 * <p>
 * In this kata, we're going to help Vicky keep track of the words she's learning.
 * <p>
 * Write a function, learnWord(word) ( LearnWord(word) in C# ) which is a method of the Robot object. The function
 * should report back whether the word is now stored, or if she already knew the word.
 * <p>
 * Example:
 * <p>
 * Robot vicky = new Robot();<br/>
 * vicky.learnWord("hello") -> "Thank you for teaching me hello"<br/>
 * vicky.learnWord("abc") -> "Thank you for teaching me abc"<br/>
 * vicky.learnWord("hello") -> "I already know the word hello"<br/>
 * vicky.learnWord("wow!") -> "I do not understand the input"
 * <p>
 * Case shouldn't matter. Only alpha characters are valid. There's also a little trick here. Enjoy!
 */
public class Robot {

    private final List<String> words;

    public Robot() {
        words = Collections.synchronizedList(new ArrayList<>());
    }

    public String learnWord(String hello) {
        String message;

        if (!hello.matches("^\\w*$")) {
            message = "I do not understand the input";
        } else if (words.contains(hello.toLowerCase())) {
            message = String.format("I already know the word %s", hello);
        } else {
            words.add(hello.toLowerCase());
            message = String.format("Thank you for teaching me %s", hello);
        }

        return message;
    }
}
