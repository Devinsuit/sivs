package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to03then1() {
        int expected = 1;
        int x1 = 0;
        int x2 = 0;
        int y1 = 4;
        int y2 = 3;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51to14then5() {
        int expected = 5;
        int x1 = 5;
        int x2 = 1;
        int y1 = 1;
        int y2 = 4;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when70to10then6() {
        int expected = 6;
        int x1 = 7;
        int x2 = 1;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}