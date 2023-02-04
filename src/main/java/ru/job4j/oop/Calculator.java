package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return x - a;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(5);
        int minus = Calculator.minus(5);
        int sum = Calculator.sum(5);
        int divide = calculator.divide(5);
        int sumAllOperation = calculator.sumAllOperation(5);
        System.out.println(multiply);
        System.out.println(minus);
        System.out.println(sum);
        System.out.println(divide);
        System.out.println(sumAllOperation);
    }
}