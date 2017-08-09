package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> originalNumbersList) {

        ArrayList<Integer> evenNumbersList = new ArrayList<Integer>();

        System.out.println("Even numbers: ");

        for (Integer number : originalNumbersList) {
            if (number % 2 != 0) {
                evenNumbersList.add(number);
                System.out.println(number);
            }
        }

        return evenNumbersList;
    }
}
