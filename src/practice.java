import java.util.Scanner;


public class practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to sum:");
        int num=input.nextInt();
        int sum=0;
        int rev=0;
        while(num>0){
           int A =num%10;
            rev=rev*10+A;
            num=num/10;
        }
        System.out.println("The sum of given num is:"+rev);


    }
}
