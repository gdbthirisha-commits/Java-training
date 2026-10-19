import java.util.Scanner;
public class result {
    
    double salary;
    result (Double salary){
        this.salary=salary;
    }
        void display(){
        System.out.print("salary=" + salary);
        
        if(salary> 20000){
            System.out.println("bonous =2000");
        }
        else if (salary <10000 && salary>5000 ){
            System.out.println("  bonous =1000");
        }
        else{
                System.out.println( " no bonous");
        }
    }

                public static void main(String []args){
                    Scanner sc= new Scanner(System.in);
                    System.out.println("enter salary :");
                    double salary= sc. nextDouble();
                    result r1=new result(salary);
                    r1.display();

                }

        }



    

    

