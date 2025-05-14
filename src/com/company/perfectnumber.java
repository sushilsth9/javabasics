package com.company;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number to find perfect number");
        int num=input.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
           if(num%i==0){
                sum=sum+i;}

        }
        System.out.println(sum);
        if(sum==num){
            System.out.println("It is a perfect number");
        }else{
            System.out.println("it is not a perfect number");
        }




    }
}
