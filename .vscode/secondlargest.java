// Find the Largest and Second Largest Elements in an Array

public class secondlargest {
    public static void main(String[]args){
        int []numbers={10,53,14,6,40};
        int largest=numbers[0];
        int secondlargest=numbers[0];
        for(int i=1;i<numbers.length;i++){
        if(numbers[i] >largest){
            secondlargest=largest;
            largest=numbers[i];
        }
        
        else if(numbers[i]>secondlargest && numbers[i]!=largest){
            secondlargest=numbers[i];
        }
    }
        System.out.println("largest ="+largest);
        System.out.println("secondlargest ="+secondlargest);
    }
}
    

    







         

        

    
    

