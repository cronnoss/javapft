package ru.chr.sandbox;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DistanceTest {

    @Test
    public void testMain() {
        Point p1 = new Point(100, 100);
        Point p2 = new Point(200, 200);
    assertEquals(141.4213562373095, Point.distance(p1, p2));
    }
}