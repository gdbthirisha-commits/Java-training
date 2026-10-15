// Find Prime Numbers Within a Given Range

import java.util.Scanner;
public class primerange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start=sc.nextInt();
        System.out.println("Enter a ending number:");
        int end=sc.nextInt();
        System.out.println("prime numbers between"+start+"and"+end+":");
        for(int number=start; number<=end;number++){
            boolean isprime=true;
            if(number<=1){
                isprime=false;
            } else{
                for(int i=2;i<number;i++){
                    if(number% i==0);
                isprime=false;
                            
        if(isprime){
            System.out.print( number+"");

        }                
            }
sc.close();
}
        }
    }
}



