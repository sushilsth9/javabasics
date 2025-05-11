package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int copynum=num;
        int sum=0;
        while(num>0){
            int r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The num is "+copynum);
        if (sum==copynum){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not");
        }
    }
}
