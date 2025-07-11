package com.codewars.kyu8.findOutWhetherTheShapeIsACube;

/**
 * To find the volume (centimeters cubed) of a cuboid you use the formula:
 * <p>
 * volume = Length * Width * Height
 * <p>
 * But someone forgot to use proper record keeping, so we only have the volume, and the length of a single side!
 * <p>
 * It's up to you to find out whether the cuboid could have equal sides (could be a cube).
 * <p>
 * Return true if the cuboid could have equal sides, return false otherwise.
 * <p>
 * Return false for invalid numbers too (e.g volume or side is less than or equal to 0).
 * <p>
 * Note: side will be an integer
 */
public class Cube {
    public static boolean isCube(int volume, int side) {
        return volume > 0 && side > 0 && volume == (side * side * side);
    }
}
