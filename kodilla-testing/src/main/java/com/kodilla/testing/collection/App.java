package com.kodilla.testing.collection;

import java.util.ArrayList;

class App {
    public static void main(String[] args) {

        ArrayList<Integer> originalNumbersList = NumbersUtility.randomNumbers(10, 1, 100);
        OddNumbersExterminator.exterminate(originalNumbersList);
    }
}
