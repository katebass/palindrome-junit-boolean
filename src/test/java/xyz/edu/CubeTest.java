package xyz.edu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {

    private Cube cube = new Cube(4);

    @Test
    public void whenSide4Volume64() {
        Assert.assertEquals(64, cube.getVolume(), 0.01);
    }

    @Test
    public void whenSide4CubeDiagonal6_92() {
        Assert.assertEquals(6.92, cube.getCubeDiagonal(), 0.01);
    }

    @Test
    public void whenSide4FaceDiagonal5_65() {
        Assert.assertEquals(5.65, cube.getFaceDiagonal(), 0.01);
    }


    @Test
    public void whenSide4SurfaceArea96() {
        Assert.assertEquals(96, cube.getSurfaceArea(), 0.01);
    }


    @Test
    public void whenSide4Perimeter48() {
        Assert.assertEquals(48, cube.getPerimeter(), 0.01);
    }
}