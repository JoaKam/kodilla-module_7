package com.kodilla.testing.shape;

class Square implements Shape {

    public String getShapeName() {

        return "Square";
    }

    public double getField() {

        double a = 5;

        return a * a;
    }

}
