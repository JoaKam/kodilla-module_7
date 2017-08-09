package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

final class NumbersUtility {

    private NumbersUtility(){

    }

    public static ArrayList<Integer> randomNumbers(int numberOfNumbers, int minNumber, int maxNumber) {

        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        System.out.println("Generated numbers: ");

        for (int i = 0; i < numberOfNumbers; i++) {
            numbersList.add(ThreadLocalRandom.current().nextInt(minNumber, maxNumber + 1));
            System.out.println(numbersList.get(i));
        }

        return numbersList;
    }
}
