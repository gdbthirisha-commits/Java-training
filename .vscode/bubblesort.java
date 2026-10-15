// Bubble Sort – Sort Array Elements in Ascending Order 

public class bubblesort {
    public static void main(String[]args){
        int numbers[]={5,3,8,1,2};
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
            int temp =numbers[j];
                numbers[j]=numbers[j+1];
                numbers[j+1]= temp;}
            }
    
            System.out.println("sorted array:");
            for(int number:numbers){
               System.out.print(number+""); 
            }

             

            
        }
    }
    
}
