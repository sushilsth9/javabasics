package com.company;

import java.util.Scanner;

public class reversethenumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int rev=0;
        while(num>0){
            int A =num%10;
            rev=rev*10+A;
            num=num/10;
        }
        System.out.println("The reverse of num is "+rev);
        System.out.println("num:"+num);
    }
}
