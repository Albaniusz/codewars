package com.codewars.kyu7.batmanQuotes;

/**
 * Batman & Robin have gotten into quite a pickle this time. The Joker has mixed up their iconic quotes and also
 * replaced one of the characters in their names, with a number. They need help getting things back in order.
 * <p>
 * Implement the getQuote method which takes in an array of quotes, and a string comprised of letters and a single
 * number (e.g. "Rob1n") where the number corresponds to their quote indexed in the passed in array.
 * <p>
 * Return the quote along with the character who said it:
 * <p>
 * BatmanQuotes.getQuote(["I am vengeance. I am the night. I am Batman!", "Holy haberdashery, Batman!", "Let's put
 * a smile on that faaaceee!"], "Rob1n") should output =>  "Robin: Holy haberdashery, Batman!
 * <p>
 * Hint: You are guaranteed that the number in the passed in string is placed somewhere after the first character
 * of the string. The quotes either belong to "Batman", "Robin", or "Joker".
 */
public class BatmanQuotes {
    public static String getQuote(String[] quotes, String hero) {
        if (hero.matches("R(\\w)*n")) {
            hero = "Robin";
        } else if (hero.matches("J(\\w)*r")) {
            hero = "Joker";
        } else {
            hero = "Batman";
        }

        String quote = switch (hero) {
            case "Robin" -> quotes[1];
            case "Joker" -> quotes[2];
            default -> quotes[0];
        };

        return hero + ": " + quote;
    }
}
