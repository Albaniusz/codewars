package com.codewars.kyu5.the80sKids.rockEmSockEmRobots;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class EightiesKids6Test {

    private Map<String, Integer> commonTactics() {
        return Map.of("punch", 20,
            "laser", 30,
            "missile", 35);
    }

    @Test
    public void testFight1() {
        Robot robot1 = new Robot("Rocky", 100, 20, new String[]{"punch", "punch", "laser", "missile"});
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[]{"missile", "missile", "missile", "missile"});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("Missile Bob has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }

    @Test
    public void testFight2() {
        Robot robot1 = new Robot("Rocky", 200, 20, new String[]{"punch", "punch", "laser", "missile"});
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[]{"missile", "missile", "missile", "missile"});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("Rocky has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }

    @Test
    public void fightDraw() {
        Robot robot1 = new Robot("Rocky", 1000, 20, new String[]{"punch", "punch", "punch"});
        Robot robot2 = new Robot("Missile Bob", 1000, 21, new String[]{"missile", "missile", "missile"});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("The fight was a draw.", EightiesKids6.fight(robot1, robot2, tactics));
    }

    @Test
    public void longFight() {
        Robot robot1 = new Robot("Rocky", 100, 20, new String[]{"punch", "punch", "punch", "punch", "punch", "punch", "punch", "punch", "punch"});
        Robot robot2 = new Robot("Missile Bob", 80, 21, new String[]{"missile", "missile", "missile", "missile", "missile", "missile", "missile", "missile", "missile"});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("Rocky has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }

    @Test
    public void testOneRobotsHaveNoTactics() {
        Robot robot1 = new Robot("Rocky", 200, 20, new String[]{"punch", "punch", "laser", "missile"});
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[]{});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("Rocky has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }

    @Test
    public void testBothRobotsHaveNoTactics() {
        Robot robot1 = new Robot("Rocky", 200, 20, new String[]{});
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[]{});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("The fight was a draw.", EightiesKids6.fight(robot1, robot2, tactics));
    }

    @Test
    public void testEpicBattle() {
        String[] strArray = new String[999];
        Arrays.fill(strArray, "punch");

        Robot robot1 = new Robot("Rocky", 200, 20, strArray);
        Robot robot2 = new Robot("Missile Bob", 19980, 21, new String[]{});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("Rocky has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }


    @Test
    public void wall() {
        String[] strArray = new String[3];
        Arrays.fill(strArray, "punch");

        Robot robot1 = new Robot("Rocky", 200, 21, strArray);
        Robot robot2 = new Robot("Missile Bob", 200, 20, new String[]{});
        Map<String, Integer> tactics = commonTactics();

        assertEquals("Rocky has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }
}
