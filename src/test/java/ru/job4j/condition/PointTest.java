package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(2, 0);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50154to22242then205dot25() {
        double expected =  205.25;
        Point pointOne = new Point(50, 154);
        Point pointTwo = new Point(222, 42);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1214to1617then5() {
        double expected = 5;
        Point pointOne = new Point(12, 14);
        Point pointTwo = new Point(16, 17);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2627to6977then65dot94() {
        double expected = 65.94;
        Point pointOne = new Point(26, 27);
        Point pointTwo = new Point(69, 77);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }
}