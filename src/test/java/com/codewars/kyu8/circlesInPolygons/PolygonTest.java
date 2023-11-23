package com.codewars.kyu8.circlesInPolygons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolygonTest {

    @Test
    public void test1() {
        //Square with sides of 5 units
        Polygon poly = new Polygon(4, 5);
        assertEquals("5.000", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test2() {
        //Octogon with sides of 9 units
        Polygon poly = new Polygon(8, 9);
        assertEquals("21.728", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test3() {
        //Triangle with sides of 4 units
        Polygon poly = new Polygon(3, 4);
        assertEquals("2.309", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void surface1() {
        Polygon poly = new Polygon(0, 0);
        assertEquals(25.0, poly.field(4, 5), 0.01);
    }

    @Test
    public void surface2() {
        Polygon poly = new Polygon(0, 0);
        assertEquals(391.1, poly.field(8, 9), 0.01);
    }

    @Test
    public void surface3() {
        Polygon poly = new Polygon(0, 0);
        assertEquals(6.928, poly.field(3, 4), 0.01);
    }
}
