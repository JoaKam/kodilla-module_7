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
        Square newSquare = new Square();
        ShapeCollector newShapeColl = new ShapeCollector();

        preparedShapeList = newShapeColl.addFigure(newShapeList, newSquare);

        //When
        boolean result = ((preparedShapeList.size() == 1) && (preparedShapeList.get(0).equals(newSquare)));

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ArrayList<Shape> newShapeList = new ArrayList<Shape>();
        ArrayList<Shape> preparedShapeList;
        Square newSquare = new Square();
        Triangle newTriangle = new Triangle();
        ShapeCollector newShapeColl = new ShapeCollector();

        preparedShapeList = newShapeColl.addFigure(newShapeList, newSquare);
        preparedShapeList = newShapeColl.addFigure(preparedShapeList, newTriangle);
        preparedShapeList = newShapeColl.removeFigure(preparedShapeList, newSquare);

        //When
        boolean result = ((preparedShapeList.size() == 1) && (preparedShapeList.get(0).equals(newTriangle)));

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure() {

        //Given
        ArrayList<Shape> newShapeList = new ArrayList<Shape>();
        ArrayList<Shape> preparedShapeList;
        Square newSquare = new Square();
        Triangle newTriangle = new Triangle();
        ShapeCollector newShapeColl = new ShapeCollector();

        preparedShapeList = newShapeColl.addFigure(newShapeList, newSquare);
        preparedShapeList = newShapeColl.addFigure(preparedShapeList, newTriangle);

        //When
        boolean result = ((newShapeColl.getFigure(preparedShapeList, 0).equals(newSquare)) && (newShapeColl.getFigure(preparedShapeList, 1).equals(newTriangle)));

        //Then
        Assert.assertTrue(result);
    }


}
