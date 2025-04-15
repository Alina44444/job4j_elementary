package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when11912to325then12dot7279() {
        double expected = 12.7279;
        Point pointOne = new Point(11, 9, 12);
        Point pointTwo = new Point(3, 2, 5);
        double out = pointOne.distance3d(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when102to725then7() {
        double expected = 7;
        Point pointOne = new Point(1, 0, 2);
        Point pointTwo = new Point(7, 2, 5);
        double out = pointOne.distance3d(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when002to205then3dot605() {
        double expected = 3.605;
        Point pointOne = new Point(0, 0, 2);
        Point pointTwo = new Point(2, 0, 5);
        double out = pointOne.distance3d(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

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