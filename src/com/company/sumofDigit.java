package com.company;

import java.util.Scanner;

public class sumofDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum=0;
        while(num>0){
            int r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println("The sum of entered num:"+sum);
    }
}
//if we do n%10 where n can any number then it will return last digit og that number without changing actual value of n
//for example if n=358 and we do n%10 so we get 8.
//if we do n/10 where n can be any number the it will eliminate last number of n
//for example if n=358 and we do n/10 then n become 35
