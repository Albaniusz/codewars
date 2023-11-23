package com.codewars.kyu8.circlesInPolygons;

/**
 * You are the owner of a box making company.
 * <p>
 * Your company can produce any equal sided polygon box, but plenty of your customers want to transport circular
 * objects in these boxes. Circles are a very common shape in the consumer industry. Tin cans, glasses, tyres
 * and CD's are a few examples of these.
 * <p>
 * As a result you decide to add this information on your boxes: The largest (diameter) circular object that can fit
 * into a given box.
 */
public class Polygon {

    int sides;

    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        //      2* P
        // r = --------------
        //      sum of sides
        return (2 * field(sides, sideLength)) / (sides * sideLength) * 2;
    }

    public double field(int sides, int sideLength) {
        // A = 1/4 * sides * sideLength^2 * ctg (PI / sides)
        double coTanA = 1.0 / Math.tan(Math.PI / sides);
        return 0.25 * sides * (sideLength * sideLength) * coTanA;
    }
}
