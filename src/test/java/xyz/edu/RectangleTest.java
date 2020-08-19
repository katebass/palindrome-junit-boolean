package xyz.edu;

import org.junit.Assert;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle1 = new Rectangle(3,4);

    @org.junit.Test
    public void whenLength3Width4ThenArea12() {
        Assert.assertEquals(12,rectangle1.getArea(), 0.001);
    }

    @org.junit.Test
    public void getPerimeter() {
        Assert.assertEquals(14,rectangle1.getPerimeter(), 0.001);
    }
}