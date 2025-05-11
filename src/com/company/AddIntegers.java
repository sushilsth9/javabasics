package com.company;


import java.util.Scanner;

public class AddIntegers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 1st number:");
        int num1=input.nextInt();
        System.out.println("Enter a 2nd number:");
        int num2=input.nextInt();
        int sum= num1+num2;
        System.out.println("Sum of " +num1+ " and "+ num2 + " is :"+sum);

    }


}
