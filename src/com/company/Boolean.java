package com.company;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean A = false;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Is it raining? (true/false): ");
            if (input.hasNextBoolean()) {
                A = input.nextBoolean();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
                input.next(); // Clear the invalid input
            }
        }
        if (A) {
            System.out.println("Take an umbrella!");
        } else {
            System.out.println("No umbrella needed.");
        }
    }
}



