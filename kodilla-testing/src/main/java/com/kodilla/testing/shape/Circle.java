package com.kodilla.testing.shape;

class Circle implements Shape {

    public String getShapeName() {

        return "Circle";
    }

    public double getField() {

        double r = 1;
        return Math.PI * r * r;
    }
}
