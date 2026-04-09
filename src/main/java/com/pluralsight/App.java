package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Greeting
        System.out.println("=== Welcome to Chase ===");

        // User Name
        String userName = "";
        System.out.println("Please enter your name: ");
        userName = reader.nextLine();

        // Balance
        double balance = 1000.0;

        // Pincode
        int pincode = 1234;
        System.out.println("Typ in your pincode");
        int enteredPincode = reader.nextInt();

        // Accessibility
        if (enteredPincode == pincode) {
            System.out.println(userName + ", Your pincode is correct");
            System.out.println("Access granted");
            System.out.printf("Your balance is $%,.2f", balance);
        }
        else {
            System.out.println(userName + ", Your pincode is incorrect");
            System.out.println("Access denied");
        }
    }

}
