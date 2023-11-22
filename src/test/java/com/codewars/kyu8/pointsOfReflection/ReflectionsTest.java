package com.codewars.kyu8.pointsOfReflection;

import org.junit.jupiter.api.Test;

import static com.codewars.kyu8.pointsOfReflection.Reflections.reflectPoint;
import static org.junit.Assert.assertArrayEquals;

public class ReflectionsTest {
    @Test
    void BasicTest() {
        assertArrayEquals(new int[]{2, 2}, reflectPoint(new int[]{0, 0}, new int[]{1, 1}));
        assertArrayEquals(new int[]{-6, -18}, reflectPoint(new int[]{2, 6}, new int[]{-2, -6}));

        assertArrayEquals(new int[]{-30, 30}, reflectPoint(new int[]{10, -10}, new int[]{-10, 10}));
        assertArrayEquals(new int[]{-25, 37}, reflectPoint(new int[]{1, -35}, new int[]{-12, 1}));
        assertArrayEquals(new int[]{-1014, -443}, reflectPoint(new int[]{1000, 15}, new int[]{-7, -214}));
        assertArrayEquals(new int[]{0, 0}, reflectPoint(new int[]{0, 0}, new int[]{0, 0}));
    }
    @Test
    void test1() {
        assertArrayEquals(new int[]{-15, -15}, reflectPoint(new int[]{-5, -5}, new int[]{-10, -10}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{15, 15}, reflectPoint(new int[]{5, 5}, new int[]{10, 10}));
    }

    @Test
    void test3() {
        assertArrayEquals(new int[]{-5, -5}, reflectPoint(new int[]{5, 5}, new int[]{0, 0}));
    }
}

