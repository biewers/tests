package com.biewer.testbed.shapes;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int x, int y, String color, int length, int width) {
        super(x, y, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " rectangle at (" + getX() + "," + getY() + ") with length " + length + " and width " + width);
    }
}
