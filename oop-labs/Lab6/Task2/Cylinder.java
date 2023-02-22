package com.company;

public class Cylinder extends Shape{
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return (Math.PI * radius * radius * height);
    }

    public double getSurfaceArea() {
        return (2* Math.PI * radius * (radius + height));
    }

    public String getShapeType() {
        return "Cylinder";
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return ("Volume: " + getVolume() + "\n" + "Surface Area: " + getSurfaceArea() + "\n" + "Shape Type: " + getShapeType());
    }
}
