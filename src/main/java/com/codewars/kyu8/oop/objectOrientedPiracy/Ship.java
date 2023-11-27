package com.codewars.kyu8.oop.objectOrientedPiracy;

/**
 * Ahoy matey!
 * <p>
 * You are a leader of a small pirate crew. And you have a plan. With the help of OOP you wish to make a pretty
 * efficient system to identify ships with heavy booty on board!
 * <p>
 * Unfortunately for you, people weigh a lot these days, so how do you know if a ship is full of gold and not people?
 * <p>
 * You begin with writing a generic Ship class / struct:
 * <p>
 * public class Ship {<br/>
 * &nbsp;&nbsp;private final double draft;<br/>
 * &nbsp;&nbsp;private final int crew;<br/>
 * <br/>
 * &nbsp;&nbsp;public Ship(double draft, int crew) {<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;this.draft = draft;<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;this.crew = crew;<br/>
 * &nbsp;&nbsp;}<br/>
 * }
 * <p>
 * Every time your spies see a new ship enter the dock, they will create a new ship object based on their observations:
 * <p>
 * draft - an estimate of the ship's weight based on how low it is in the water<br/>
 * crew - the count of crew on board<br/>
 * Ship titanic = new Ship(15, 10);
 * <p>
 * Task
 * <p>
 * You have access to the ship "draft" and "crew". "Draft" is the total ship weight and "crew" is the number of humans on the ship.
 * <p>
 * Each crew member adds 1.5 units to the ship draft. If after removing the weight of the crew, the draft is still more than 20, then the ship is worth looting. Any ship weighing that much must have a lot of booty!
 * <p>
 * Add the method
 * <p>
 * isWorthIt
 * <p>
 * to decide if the ship is worthy to loot. For example:
 * <p>
 * titanic.isWorthIt() == false
 * <p>
 * Good luck and may you find GOOOLD!
 */
public class Ship {

    private final double draft;

    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        return draft - (crew * 1.5) > 20;
    }
}
