package com.biewer.testbed.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " circle at (" + getX() + "," + getY() + ") with radius " + radius);
    }

}
