package com.company;

public class Cube extends Cuboid {

    public Cube(double edge) {
        super(edge, edge, edge);
    }

    public String getShapeType() {
        return "Cube";
    }
}
