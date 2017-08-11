package com.kodilla.testing.shape;

class Triangle implements Shape {

    public String getShapeName() {

        return "Triangle";
    }

    public double getField() {

        double a = 5;
        double h = 10;

        return 0.5 * a * h;

    }
}
