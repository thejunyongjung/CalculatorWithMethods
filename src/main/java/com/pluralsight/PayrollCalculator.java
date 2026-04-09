package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("This is the Payroll Calculator");

        String name = getName(read);
        double hours = getHoursWorked(read);
        double rate = getPayRate(read);
        double grossPay = calculateGrossPay(hours, rate);
        displayPayroll(name, grossPay);

        read.close();

    }
    public static String getName(Scanner read) {
        System.out.print("Please enter your name: ");
        return read.nextLine();
    }
    public static double getHoursWorked(Scanner read) {
        System.out.print("Enter the number of hours worked: ");
        return read.nextDouble();
    }
    public static double getPayRate(Scanner read) {
        System.out.print("Enter the pay rate: ");
        return read.nextDouble();
    }
    public static double calculateGrossPay(double hours, double rate) {
        return hours * rate;
    }
    public static void displayPayroll(String name, double grossPay){
        System.out.printf("Employee: %s, Gross Pay: $%,.2f", name, grossPay);
    }
}
