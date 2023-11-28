package com.codewars.kyu8.quadrants;

/**
 * Task
 * <p>
 * Given a point in a Euclidean plane (x and y), return the quadrant the point exists in: 1, 2, 3 or 4 (integer). x
 * and y are non-zero integers, therefore the given point never lies on the axes.
 * <p>
 * Examples
 * <p>
 * (1, 2)     => 1<br/>
 * (3, 5)     => 1<br/>
 * (-10, 100) => 2<br/>
 * (-1, -9)   => 3<br/>
 * (19, -56)  => 4
 * <p>
 * Reference
 *
 * <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Cartesian_coordinates_2D.svg/300px-Cartesian_coordinates_2D.svg.png"/>
 * <p>
 * There are four quadrants:
 * <ol>
 * <li>First quadrant, the quadrant in the top-right, contains all points with positive X and Y</li>
 * <li>Second quadrant, the quadrant in the top-left, contains all points with negative X, but positive Y</li>
 * <li>Third quadrant, the quadrant in the bottom-left, contains all points with negative X and Y</li>
 * <li>Fourth quadrant, the quadrant in the bottom-right, contains all points with positive X, but negative Y</li>
 * </ol>
 * More on quadrants: <a href="https://en.wikipedia.org/wiki/Quadrant_(plane_geometry)">Quadrant (plane geometry) - Wikipedia</a>
 */
public class Kata {
    public static int quadrant(int x, int y) {
        int result;

        if (x > 0) {
            result = y > 0 ? 1 : 4;
        } else {
            result = y > 0 ? 2 : 3;
        }

        return result;
    }
}
