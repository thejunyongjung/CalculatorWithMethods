package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }

    public static Boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static Boolean isPositive(int number) {
        return number > 0;
    }
}
