// Perform Arithmetic Operations on Two Numbers

import java.util.Scanner;
public class calculate {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
    
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Addition" +(a+b));
        System.out.println("subraction"+(a-b));
        System.out.println("multiplication"+(a*b));
        System.out.println("divide"+(a/b));

    } 
    
}
