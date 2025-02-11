package com.dc.demo.functionOverloading;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Calling the int version " + calculator.add(3,5));
        System.out.println("Calling the double version " + calculator.add(3.5,5.5));
        System.out.println("Calling the three parameter version " + calculator.add(3,5, 7));
    }
}
