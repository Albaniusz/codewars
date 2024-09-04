package com.codewars.kyu7.willYouSurviveTheZombieOnslaught;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void shouldKillAll3Zombies() {
        assertEquals("You shot all 3 zombies.", Kata.zombieShootout(3, 10, 10));
    }

    @Test
    public void shouldBeingEatenCauseOverwhelmedWith16Killed() {
        assertEquals("You shot 16 zombies before being eaten: overwhelmed.", Kata.zombieShootout(100, 8, 200));
    }

    @Test
    public void shouldBeingEatenCasueOutOfAmmoWith8Killed() {
        assertEquals("You shot 8 zombies before being eaten: ran out of ammo.", Kata.zombieShootout(50, 10, 8));
    }
}
