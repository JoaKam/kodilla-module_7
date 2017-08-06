package com.kodilla.testing;

class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

    /* tests  */

        int a = 5;
        int b = 3;
        int addResult = a + b;
        int subtractResult = a - b;

        Calculator newCalculator = new Calculator();

        if (addResult == newCalculator.add2Numbers(a, b)) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error in adding!");
        }

        if (subtractResult == newCalculator.subtract2Numbers(a, b)) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error in subtraction!");
        }
    }
}
