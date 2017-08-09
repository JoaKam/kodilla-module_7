
package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

        if (newList.size() == 0){
            System.out.println("Test1 OK");
        }else{
            System.out.println("Test1 error");
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> originalNumbersList = new ArrayList <Integer>();
        ArrayList<Integer> newList;
        Integer a = 2;
        Integer b = 1;

        originalNumbersList.add(a);
        originalNumbersList.add(b);

        newList = OddNumbersExterminator.exterminate(originalNumbersList);

        if ((newList.size() == 1) && (newList.get(0) == b)){
            System.out.println("Test2 OK");
        }else{
            System.out.println("Test2 error");
        }
    }

}
