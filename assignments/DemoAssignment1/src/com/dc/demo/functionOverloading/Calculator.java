package com.dc.demo.functionOverloading;

public class Calculator {

//    Simple function overloading,

//    Which function is going to be executed when the
//    function name is same, depends on the return type
//    parameter's type, and the number of parameters

    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public double add(double a, double b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }

}