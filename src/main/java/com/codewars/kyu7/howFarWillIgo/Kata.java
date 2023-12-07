package com.codewars.kyu7.howFarWillIgo;

/**
 * You have recently discovered that horses travel in a unique pattern - they're either running (at top speed)
 * or resting (standing still).
 * <p>
 * Here's an example of how one particular horse might travel:
 * <p>
 * The horse Blaze can run at 14 metres/second for 60 seconds, but must then rest for 45 seconds.<br/>
 * After 500 seconds Blaze will have traveled 4200 metres.
 * <p>
 * Your job is to write a function that returns how long a horse will have traveled after a given time.
 * <p>
 * Input:
 * <ul>
 *  <li>totalTime - How long the horse will be traveling (in seconds)</li>
 *  <li>runTime - How long the horse can run for before having to rest (in seconds)</li>
 *  <li>restTime - How long the horse have to rest for after running (in seconds)</li>
 *  <li>speed - The max speed of the horse (in metres/second)</li>
 * </ul>
 */
public class Kata {
    public static int travel(int totalTime, int runTime, int restTime, int speed) {
        int periodTime = runTime + restTime;
//        double periods = Math.ceil((double) totalTime / periodTime);
        double periods = (double) totalTime / periodTime;
        int periodPart = totalTime % periodTime;
        if (periodPart >= ((double) runTime / (runTime + restTime) * 100)) {
            ++periods;
        }
        double distancePeriod = runTime * speed;
        double results = periods * distancePeriod;

        return (int) results;
    }
}
