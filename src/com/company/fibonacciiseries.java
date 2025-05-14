package com.company;

import java.util.Scanner;

public class fibonacciiseries {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the limit of fibonacciiseries");
        int num=input.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<num;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }

    }
}
