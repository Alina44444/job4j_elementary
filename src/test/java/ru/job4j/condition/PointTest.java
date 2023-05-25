package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50154to22242then205dot25() {
        double expected =  205.25;
        int x1 = 50;
        int y1 = 154;
        int x2 = 222;
        int y2 = 42;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1214to1617then5() {
        double expected = 5;
        int x1 = 12;
        int y1 = 14;
        int x2 = 16;
        int y2 = 17;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2627to6977then65dot94() {
        double expected = 65.94;
        int x1 = 26;
        int y1 = 27;
        int x2 = 69;
        int y2 = 77;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}