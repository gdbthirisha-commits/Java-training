// Method Overloading in Java – Addition of Numbers

import java.util.Scanner;
public class overloading{
    Scanner sc=new Scanner(System.in);

    
    int add( int x,int y){
        return x+y;
}
int add(int a, int b,int c){
    return a+b+c;

}
double add(double x,double y){
return x+y;
}

public  static void main(String []args){
overloading c=new overloading();
System.out.println("enter two integers :");
int a =c.sc.nextInt( );
int b=c .sc.nextInt();
System.out.println("sum=" +c.add(a,b));

System.out.println("enter three numbers :");
    int x=c.sc.nextInt();
    int y=c.sc.nextInt();
    int z=c.sc.nextInt();
    System.out.println("sum=" +c.add(x,y,z));

 System.out.println("enter two values :");
 double p=c.sc.nextDouble();
 double q= c.sc.nextDouble();
 System.out.println("sum="+ c.add(p,q));   

}

}
