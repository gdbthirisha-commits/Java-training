// Fibonacci Series Using a For Loop 

import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       System.out.print("enter a number of terms");
        int number=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=number;i++){
            System.out.print(a+"");
            int next=a+b;
            a=b;
            b=next;
            

        }

    }
    
}
