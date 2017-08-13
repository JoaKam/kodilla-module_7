package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Executing test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

        //Given
        ArrayList<Shape> newShapeList = new ArrayList<>();
        ArrayList<Shape> preparedShapeList;
        Square newSquare = new Square(1.0);
        ShapeCollector newShapeColl = new ShapeCollector();

        //When
        preparedShapeList = newShapeColl.addFigure(newShapeList, newSquare);

        //Then
        Assert.assertTrue(preparedShapeList.size() == 1);
        Assert.assertTrue(preparedShapeList.get(0).equals(newSquare));
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ArrayList<Shape> newShapeList = new ArrayList<Shape>();
        ArrayList<Shape> preparedShapeList;
        Square newSquare = new Square(1.0);
        Triangle newTriangle = new Triangle(1.0, 1.0);
        ShapeCollector newShapeColl = new ShapeCollector();

        //When
        preparedShapeList = newShapeColl.addFigure(newShapeList, newSquare);
        preparedShapeList = newShapeColl.addFigure(preparedShapeList, newTriangle);
        preparedShapeList = newShapeColl.removeFigure(preparedShapeList, newSquare);

        //Then
        Assert.assertTrue(preparedShapeList.size() == 1);
        Assert.assertTrue(preparedShapeList.get(0).equals(newTriangle));
    }

    @Test
    public void testGetFigure() {

        //Given
        ArrayList<Shape> newShapeList = new ArrayList<Shape>();
        ArrayList<Shape> preparedShapeList;
        Square newSquare = new Square(1.0);
        Triangle newTriangle = new Triangle(1.0, 1.0);
        ShapeCollector newShapeColl = new ShapeCollector();

        //When
        preparedShapeList = newShapeColl.addFigure(newShapeList, newSquare);
        preparedShapeList = newShapeColl.addFigure(preparedShapeList, newTriangle);

        //Then
        Assert.assertTrue(newShapeColl.getFigure(preparedShapeList, 0).equals(newSquare));
        Assert.assertTrue(newShapeColl.getFigure(preparedShapeList, 1).equals(newTriangle));
    }


}
