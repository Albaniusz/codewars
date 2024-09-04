package com.codewars.kyu7.the80sKids.howManyLicksDoesItTake;

import java.util.Map;

/**
 * How many licks does it take to get to the tootsie roll center of a tootsie pop?
 * <p>
 * A group of engineering students from Purdue University reported that its licking machine, modeled after a human
 * tongue, took an average of 364 licks to get to the center of a Tootsie Pop. Twenty of the group's volunteers
 * assumed the licking challenge-unassisted by machinery-and averaged 252 licks each to the center.
 * <p>
 * Your task, if you choose to accept it, is to write a function that will return the number of licks it took to get
 * to the tootsie roll center of a tootsie pop, given some environmental variables.
 * <p>
 * Everyone knows it's harder to lick a tootsie pop in cold weather but it's easier if the sun is out. You will
 * be given an object of environmental conditions for each trial paired with a value that will increase or decrease
 * the number of licks. The environmental conditions all apply to the same trial.
 * <p>
 * Assuming that it would normally take 252 licks to get to the tootsie roll center of a tootsie pop, return
 * the new total of licks along with the condition that proved to be most challenging (causing the most added licks)
 * in that trial.
 * <p>
 * Example:
 * <p>
 * totalLicks({ "freezing temps": 10, "clear skies": -2 });
 * <p>
 * Should return:
 * <p>
 * "It took 260 licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was freezing temps."
 * <p>
 * Other cases: If there are no challenges, the toughest challenge sentence should be omitted. If there are multiple
 * challenges with the highest toughest amount, the first one presented will be the toughest. If an environment
 * variable is present, it will be either a positive or negative integer. No need to validate.
 */
public class EightiesKids1 {
    private final static String MESSAGE_CORE = "It took %d licks to get to the tootsie roll center of a tootsie pop.%s";

    private final static String MESSAGE_CHALLENGE = " The toughest challenge was %s.";

    public static String totalLicks(Map<String, Integer> env) {
        int lickCounter = 252;
        int challengeMax = 0;
        String challengeName = null;

        for (Map.Entry<String, Integer> entry : env.entrySet()) {
            int value = entry.getValue();
            lickCounter += value;
            if (value > challengeMax) {
                challengeMax = value;
                challengeName = entry.getKey();
            }
        }

        return String.format(MESSAGE_CORE, lickCounter, challengeMax > 0 ? String.format(MESSAGE_CHALLENGE, challengeName) : "");
    }
}
