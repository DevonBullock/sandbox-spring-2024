package org.example.sandbox.exception;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int... b) {
        int sum = a;
        for(int i : b) {
            sum += i;
        }
        return sum;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(5,5));
        System.out.println(add(5,5,5));
    }
}
