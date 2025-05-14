import java.util.Scanner;


public class practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to sum:");
        int num=input.nextInt();
        int sum=0;
        while(num>0){
            int A=num%10;
            sum=sum+(A*A*A);
            num=num/10;

        }
        System.out.println("the of the given num is:"+sum);

    }
}
