// Reverse a String Using a For Loop

public class reversestring { 
    public static void main(String[]args){
        String name="Thirisha";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
            System.out.print("Original string:"+name);
            System.out.print("Reverse a string:"+reverse);

        }
    }
    

