package com.codewars.kyu8.getPlanetNameByID;

public class Planet {
    static String getPlanetName(int id) {
        return switch (id) {
            case 1 -> "Mercury";
            case 2 -> "Venus";
            case 3 -> "Earth";
            case 4 -> "Mars";
            case 5 -> "Jupiter";
            case 6 -> "Saturn";
            case 7 -> "Uranus";
            case 8 -> "Neptune";
            default -> null;
        };
    }
}
