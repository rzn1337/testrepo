package com.company;

public abstract class Shape {
    private static int numShapes = 4;
    private int id;

    public Shape() {

    }

    public int getNumShapes() {
        return numShapes;
    }

    public int getId() {
        return id;
    }

    public abstract String toString();


    public abstract double getVolume();

    public abstract double getSurfaceArea();

    public abstract String getShapeType();
}
