package com.codewars.kyu8.localizeTheBarycenterOfATriangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <img src="https://i.imgur.com/hpDQY8o.png"/>
 * <p>
 * The medians of a triangle are the segments that unit the vertices with the midpoint of their opposite sides. The three medians of a triangle intersect at the same point, called the barycenter or the centroid. Given a triangle, defined by the cartesian coordinates of its vertices we need to localize its barycenter or centroid.
 * <p>
 * The function bar_triang() or barTriang or bar-triang, receives the coordinates of the three vertices A, B and C  as three different arguments and outputs the coordinates of the barycenter O in an array [xO, yO]
 * <p>
 * This is how our asked function should work: the result of the coordinates should be expressed up to four decimals, (rounded result).
 * <p>
 * You know that the coordinates of the barycenter are given by the following formulas.
 * <p>
 * <img src="https://i.imgur.com/B0tjxUG.jpeg"/>
 * <p>
 * For additional information about this important point of a triangle see at: (https://en.wikipedia.org/wiki/Centroid)
 * <p>
 * Let's see some cases:
 * <p>
 * barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}
 * <p>
 * barTriang([4, 2], [12, 2], [6, 10] ------> {7.3333, 4.6667}
 * The given points form a real or a degenerate triangle but in each case the above formulas can be used.
 * <p>
 * Enjoy it and happy coding!!
 */
public class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        return new double[]{
            BigDecimal.valueOf((x[0] + y[0] + z[0]) / 3).setScale(4, RoundingMode.HALF_UP).doubleValue(),
            BigDecimal.valueOf((x[1] + y[1] + z[1]) / 3).setScale(4, RoundingMode.HALF_UP).doubleValue()
        };
    }
}
