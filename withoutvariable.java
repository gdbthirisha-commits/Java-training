// Swapping Two Numbers Without a Temporary Variable in Java

public class withoutvariable {
    public static void main(String[]args){
        int a=50;
        int b=30;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
