package com.pluralsight;
import java.util.Scanner;
public class FoodMenu {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number (1–3): ");
        int choice = read.nextInt();

        // WRITE SWITCH HERE
        switch (choice) {
            case 1:
                System.out.println("You chose Pizza");
                break;
            case 2:
                System.out.println("You chose Burger");
                break;
            case 3:
                System.out.println("You chose Pasta");
                break;
            default:
                System.out.println("Invalid choice");
        }

        read.close();
    }
}
