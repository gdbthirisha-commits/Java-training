// Remove Duplicate Characters from a String

public class removeduplicates{
    public static void main(String[]args){
        String name="Thirisha";
        String result="";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(result.indexOf(ch)==-1){
            result=result+ch;

        }
    }
    System.out.print("original ="+ name);
    System.out.print("after removing duplicates="+result);
    
}
}

