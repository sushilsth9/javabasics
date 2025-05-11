package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        int copynum=num;
        int rev=0;
        while(num>0){
            int A=num%10;
            rev=rev*10+A;
            num=num/10;
        }
        System.out.println("copy num: "+copynum);
        System.out.println("rev: "+rev);
        if(rev==copynum){
            System.out.println("it is Pallindrome");
        }
        else{
            System.out.println("It is not Pallindrome");
        }
    }
}
