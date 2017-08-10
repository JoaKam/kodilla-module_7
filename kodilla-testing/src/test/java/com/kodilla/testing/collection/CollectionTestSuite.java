
package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Starting test...");
    }

    @After
    public void after() {
        System.out.println("Test ended.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> newList;
        ArrayList<Integer> originalNumbersList = NumbersUtility.randomNumbers(0, 1, 100);
        newList = OddNumbersExterminator.exterminate(originalNumbersList);

        Assert.assertEquals(newList.size(), 0);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> originalNumbersList = new ArrayList<Integer>();
        ArrayList<Integer> newList;
        Integer a = 2;
        Integer b = 1;

        originalNumbersList.add(a);
        originalNumbersList.add(b);

        newList = OddNumbersExterminator.exterminate(originalNumbersList);

        Assert.assertTrue((newList.size() == 1) && (newList.get(0) == b));

    }

}
