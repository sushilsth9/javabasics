package com.company;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        System.out.println("Enter a digit to count:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("The count of given digit is "+count);

    }
}
