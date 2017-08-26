package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    public static int[] prepareNumbersArray() {

        int[] newNumbersArray = new int[20];

        for (int i = 0; i < 20; i = i + 2) {
            newNumbersArray[i] = 0;
            newNumbersArray[i + 1] = 2;
        }

        return newNumbersArray;
    }


    @Test
    void testGetAverage() {

        //Given
        int[] numbersArray = prepareNumbersArray();

        //When
        int numberAverage = ArrayOperations.getAverage(numbersArray);

        //Then
        Assert.assertEquals(1, numberAverage);
    }

}
