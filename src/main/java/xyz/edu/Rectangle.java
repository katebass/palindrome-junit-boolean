package xyz.edu;
/*
    Copyright: Kateryna Basova KHNUE
    Classname: Rectangle

*/

import java.util.logging.Logger;

public class Rectangle {
    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
    private double length;
    private double width;

    public final double PI = 3.14;

    // create constructor without parameters
    public Rectangle() {
    }

    // create constructor with parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getter for the property 'length'
    public double getLength() {
        return length;
    }

    // setter for the property 'length'
    public void setLength(double length) {
        this.length = length;
    }

    // // getter for the property 'width'
    public double getWidth() {
        return width;
    }

    // setter for the property 'width'
    public void setWidth(double width) {
        this.width = width;
    }

    // getter for the property 'PI'
    public double getPI() {
        return PI;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public double getArea() {
        LOGGER.info("RECTANGLE_GET_AREA_INFO");
        return this.getLength() * this.getWidth();
    }
}
