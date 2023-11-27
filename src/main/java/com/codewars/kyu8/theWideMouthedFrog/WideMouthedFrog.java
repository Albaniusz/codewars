package com.codewars.kyu8.theWideMouthedFrog;

/**
 * The wide-mouth frog is particularly interested in the eating habits of other creatures.
 * <p>
 * He just can't stop asking the creatures he encounters what they like to eat. But, then he meets the alligator
 * who just LOVES to eat wide-mouthed frogs!
 * <p>
 * When he meets the alligator, it then makes a tiny mouth.
 * <p>
 * Your goal in this kata is to create complete the mouth_size method this method takes one argument animal which
 * corresponds to the animal encountered by the frog. If this one is an alligator (case-insensitive) return small
 * otherwise return wide.
 */
public class WideMouthedFrog {
    public static String mouthSize(String animal) {
        return "alligator".equals(animal.toLowerCase()) ? "small" : "wide";
    }
}
