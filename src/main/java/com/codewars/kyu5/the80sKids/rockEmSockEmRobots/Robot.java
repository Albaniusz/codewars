package com.codewars.kyu5.the80sKids.rockEmSockEmRobots;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Robot {

    private String name;

    private int health;

    private int speed;

    private String[] tactics;
}
