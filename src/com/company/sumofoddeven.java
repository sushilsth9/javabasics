package com.company;

import java.util.Scanner;

public class sumofoddeven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to add even or odd");
        int num=input.nextInt();
        int sumodd=0;
        int sumeven=0;
        while(num>0){
           int A= num%10;
           if(A%2==0){
           sumeven=sumeven+A;}
           else{
               sumodd=sumodd+A;
           }
           num=num/10;
        }
        System.out.println("The sum of even number:"+sumeven);
        System.out.println("The sum of odd number:"+sumodd);

    }
}
