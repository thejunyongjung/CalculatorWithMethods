package com.pluralsight;
import java.util.Scanner;

public class App2 {

    // Starting point of an app
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Chase ATM ===");
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();

        int correctPin = 1234; // Simulated PIN (normally from a database)
        double balance = 100; // Initial balance
        double deposit = 0; // Initializing deposit

        int attempts = 3;
        int enteredPin = 0;
        while(attempts > 0 && enteredPin != correctPin) {
            System.out.print("Please enter your PIN: ");
            enteredPin = scanner.nextInt();

            // Checking the pincode
            if (enteredPin == correctPin) {
                System.out.println(name + " Access granted. Welcome!");
                System.out.println("Pick an option");
                System.out.println("1. Balance");
                System.out.println("2. Withdraw 100 dollars");
                System.out.println("3. Deposit");
                System.out.print("Choose 1, 2, or 3: ");

                int option = scanner.nextInt();
                if  (option == 1) {
                    System.out.println("Your current balance is " + balance);
                }
                else if (option == 2 && balance >= 100) {
                    balance -= 100;
                    System.out.println("Withdrawing 100 dollars");
                    System.out.println("Your current balance is " + balance);
                }
                else if (option == 2 && balance <= 100) {
                    System.out.println("Insufficient funds");
                    System.out.printf("Your current balance is $%,.0f\n", balance);
                }
                else if (option == 3) {
                    System.out.println("Your current balance is " + balance);
                    System.out.print("How much would you like to deposit?: $");
                    deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.printf("You have deposited $%,.0f\n", deposit);
                    System.out.printf("Your new balance is $%,.0f\n", balance);
                    System.out.println("Thank you for using Chase !");
                }
                else {
                    System.out.println("Invalid option");
                }

            } else {
                System.out.println(name + " Access denied. Incorrect PIN.");
                attempts--;
                System.out.println("You only have " + attempts + "attempts left");
            }

        }

        scanner.close();
    }
}