// Sum of Digits Using Recursion in Java

public class sumofdigits{
    static int sumoflength(int n){
        if(n == 0){
            return 0;
        }
            return(n % 10)+sumoflength(n/10);
            
            }
public static void main(String[]args){
    int result=sumoflength(94687324);
    System.out.println("sum of digits="+ result);
}

    }


