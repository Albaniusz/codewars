package com.codewars.kyu8.grasshopper.terminalGame1;

/**
 * <h1>Terminal Game - Create Hero Prototype</h1>
 * <p>
 * In this first kata in the series, you need to define a Hero prototype to be used in a terminal game. The hero should have the following attributes:
 * <p>
 * attribute	value<br/>
 * name	user argument or 'Hero'<br/>
 * position	'00'<br/>
 * health	100<br/>
 * damage	5<br/>
 * experience	0
 */
public class Hero {

    public String name = "Hero";

    public String position = "00";

    public int health = 100;

    public int damage = 5;

    public int experience = 0;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }
}
