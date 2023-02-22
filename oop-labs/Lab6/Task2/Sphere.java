package com.company;

public class Sphere extends Shape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4/3 * Math.PI * radius * radius * radius);
    }

    public double getSurfaceArea() {
        return (4 * Math.PI * radius * radius);
    }

    public String getShapeType() {
        return "Sphere";
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return ("Volume: " + getVolume() + "\n" + "Surface Area: " + getSurfaceArea() + "\n" + "Shape Type: " + getShapeType());
    }
}
