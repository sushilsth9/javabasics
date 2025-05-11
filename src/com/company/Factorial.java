package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of num is " + fact);
    }
}

