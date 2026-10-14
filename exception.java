// Exception Handling Using Try-Catch-Finally in Java

import java.util.Scanner;
import java.util.InputMismatchException;
public class exception {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        {
            try{
                System.out.print("enter first number:");
                int a=sc.nextInt();
                System.out.print("enter second number:");
                int b=sc.nextInt();

               System.out.println("Result: " + a/b);

            }
        
             catch (ArithmeticException e){
                System.out.println("can't divided by zero!");

            }
            catch (InputMismatchException e){
                System.out.println("enter numbers only!");

            
            }
            finally{
                System.out.println("program finished");
                
        }
        }
    }
    
}
