package com.codewars.kyu7.helpYourFellowWarrior;

import java.util.ArrayList;
import java.util.List;

/**
 * Let's say that in a hypothetical platform that resembles Codewars there is a clan with 2 warriors. The 2nd one
 * in ranking (lets call him D) wants to at least reach the honor score of his ally (lets call her M). (Let's say
 * that there is no antagonism here, he just wants to prove his ally that she should be proud to have him in the clan
 * and sees this as the only way to achieve it! :P )
 * <p>
 * Your task is to help D by providing him with the quickest path to reach M's honor score.
 * <p>
 * In this hypothetical platform there are 2 kinds of kata to be solved:
 * <p>
 * '2kyu' worth of 1 point<br/>
 * '1kyu' worth of 2 points
 * <p>
 * So if for example:
 * <p>
 * M has honor 11<br/>
 * D has honor 2
 * <p>
 * D could reach **Ms** honor by solving kata worth of 9`. He has many options to do this:
 * <p>
 * Solve 9 '2kyus' (9*1 -> 9) => Solve 9 kata<br/>
 * Solve 4 '1kyus' and 1 '2kyus' (4*2 + 1*1-> 9) => Solve 5 kata<br/>
 * Solve 2 '1kyus' and 5 '2kyus' (2*2 + 5*1 -> 9) => Solve 7 kata<br/>
 * etc etc...
 * <p>
 * The quickest path to reach the honor score is:
 * <p>
 * 4 '1kyus' and 1 '2kyus' => Solve only 5 kata
 * <p>
 * Create a function getHonorPath that accepts 2 arguments honorScore & targetHonorScore with score integers
 * of 2 warriors and returns an object with the quickest path for the first one to reach the 2nd's honor. For example:
 * <p>
 * getHonorPath(2, 11) should return { '1kyus': 4, '2kyus': 1 }
 * getHonorPath(20, 11) should return {}
 * <p>
 * For the purpose of this kata you do not have to worry about any non-integer arguments for honor scores
 */
public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
        if (targetHonorScore <= honorScore) {
            return "";
        }

        int toEarn = targetHonorScore - honorScore;

        return String.format("2kyus: %d, 1kyus: %d", toEarn % 2, toEarn / 2);
    }
}
