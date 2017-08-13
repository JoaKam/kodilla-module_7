package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector {

    public ShapeCollector() {

    }

    public ArrayList<Shape> addFigure(ArrayList<Shape> shapesList, Shape shape) {

        shapesList.add(shape);
        return shapesList;
    }

    public ArrayList<Shape> removeFigure(ArrayList<Shape> shapesList, Shape shape) {

        shapesList.remove(shape);
        return shapesList;
    }

    public Shape getFigure(ArrayList<Shape> shapesList, int n) {

        return shapesList.get(n);
    }

    public void showFigures(ArrayList<Shape> shapesList) {

        for (Shape shape: shapesList){
            System.out.println (shape.getShapeName());
        }
    }

}
