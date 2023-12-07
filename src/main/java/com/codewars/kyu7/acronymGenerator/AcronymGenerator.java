package com.codewars.kyu7.acronymGenerator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * In nearly every company each employee has a certain acronym containing the first characters of his first
 * and last name(s).
 * <p>
 * Your task is to write an acronym generator which generates an acronym for a given name. You don't have to care
 * about duplicate acronyms (someone else will do this for you). Note that names can be given in upper or in lower case.
 * The acronym shall always be upper case.
 * <p>
 * Normally the acronym is always the first letter of your first and the first letter of the last name in upper case.
 * <p>
 * For example:
 * <p>
 * Thomas Meyer => TM
 * <p>
 * martin schmidt => MS
 * <p>
 * In your company there work only people with a maximum of two first names. If a person has two first names, they
 * might be joined with a dash.
 * <p>
 * Jan-Erich Schmidt => JES Jan Erich Mueller => JEM
 * <p>
 * Last names may also be joined with a dash. No one can have more than two last names.
 * <p>
 * Paul Meyer-Schmidt
 * <p>
 * In Germany, there are last names which have the leading word "von". This shall be abbreviated with a lower case "v":
 * <p>
 * Paul von Lahnstein => PvL
 * <p>
 * Martin von Lahnstein-Meyer => MvLM
 * <p>
 * Happy coding!
 */
public class AcronymGenerator {
    public static String createAcronym(String lastName, String firstName) {
        return Stream.of((firstName + " " + lastName).replace("-", " ").split(" "))
            .map(item -> {
                if ("von".equals(item) || "VON".equals(item)) {
                    return "v";
                } else {
                    return String.valueOf(item.charAt(0)).toUpperCase();
                }
            })
            .collect(Collectors.joining());
    }
}
