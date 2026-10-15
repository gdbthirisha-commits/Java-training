// Find the Largest of Three Numbers Using If-Else

import java.util.Scanner;
public class largestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number =");
        int a=sc.nextInt();
        System.out.println("enter a second number");
        int b=sc.nextInt();
       System.out.println("enter a third number");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("Largest="+a);
        } else if(b>=a && b>=c){
            System.out.println("Largest="+b);
        }else{
            System.out.println("Largest="+c);
            
        
        }
    
    }
    
}
