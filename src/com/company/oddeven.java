package com.company;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to check odd or even number:");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
}
