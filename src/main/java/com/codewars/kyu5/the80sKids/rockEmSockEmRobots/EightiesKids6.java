package com.codewars.kyu5.the80sKids.rockEmSockEmRobots;

import java.util.Map;

/**
 * You and your friends have been battling it out with your Rock 'Em, Sock 'Em robots, but things have gotten
 * a little boring. You've each decided to add some amazing new features to your robot and automate them to battle
 * to the death.
 * <p>
 * Each robot will be represented by an object. You will be given two robot objects, and an object of battle tactics
 * and how much damage they produce. Each robot will have a name, hit points, speed, and then a list of battle tactics
 * they are to perform in order. Whichever robot has the best speed, will attack first with one battle tactic.
 * <p>
 * Your job is to decide who wins.
 * <p>
 * Example:
 * <p>
 * robot1.getName() => "Rocky"<br/>
 * robot1.getHealth() => 100<br/>
 * robot1.getSpeed() => 20<br/>
 * robot1.getTactics() => ["punch", "punch", "laser", "missile"]
 * <p>
 * robot2.getName() => "Missile Bob"<br/>
 * robot2.getHealth() => 100<br/>
 * robot2.getSpeed() => 21<br/>
 * robot2.getTactics() => ["missile", "missile", "missile", "missile"]
 * <p>
 * tactics = {<br/>
 * "punch" => 20,<br/>
 * "laser" => 30,<br/>
 * "missile" => 35<br/>
 * }
 * <p>
 * fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) -> "Missile Bob has won the fight."
 * <p>
 * robot2 uses the first tactic, "missile" because he has the most speed. This reduces robot1's health by 35. Now robot1 uses a punch, and so on.
 * <p>
 * Rules
 * <ul>
 * <li>A robot with the most speed attacks first. If they are tied, the first robot passed in attacks first.</li>
 * <li>Robots alternate turns attacking. Tactics are used in order.</li>
 * <li>A fight is over when a robot has 0 or less health or both robots have run out of tactics.</li>
 * <li>A robot who has no tactics left does no more damage, but the other robot may use the rest of his tactics.</li>
 * <li>If both robots run out of tactics, whoever has the most health wins. If one robot has 0 health, the other wins. Return the message "{Name} has won the fight."</li>
 * <li>If both robots run out of tactics and are tied for health, the fight is a draw. Return "The fight was a draw."</li>
 * </ul>
 * To Java warriors
 * <p>
 * Robot class is immutable.
 */
public class EightiesKids6 {

    private final static String FINAL_MSG = "%s has won the fight.";

    private final static String DRAW_MSG = "The fight was a draw.";

    public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {
        Robot first, second;

        if (robot2.getSpeed() > robot1.getSpeed()) {
            first = robot2;
            second = robot1;
        } else {
            first = robot1;
            second = robot2;
        }

        int firstHealth = first.getHealth();
        int secondHealth = second.getHealth();

        int round = 0;
        while (true) {
            int pointsFirst = findTacticsValue(first, tactics, round);
            int pointsSecond = findTacticsValue(second, tactics, round);

            if (pointsFirst < 0 && pointsSecond < 0) {
                if (firstHealth == secondHealth) {
                    return DRAW_MSG;
                } else {
                    return String.format(FINAL_MSG, firstHealth > secondHealth ? first.getName():  second.getName());
                }
            }

            secondHealth -= Math.max(pointsFirst, 0);
            if (secondHealth <= 0) {
                return String.format(FINAL_MSG, first.getName());
            }

            firstHealth -= Math.max(pointsSecond, 0);
            if (firstHealth <= 0) {
                return String.format(FINAL_MSG, second.getName());
            }

            round++;
        }
    }

    private static int findTacticsValue(Robot attacker, Map<String, Integer> tactics, int round) {
        String attackerTactic = round < attacker.getTactics().length ? attacker.getTactics()[round] : "";
        return attackerTactic.isEmpty() ? -1 : tactics.get(attackerTactic);
    }
}
