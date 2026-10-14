// Sort Employees by Salary, Name, and Age Using Comparator


import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class comparator{
    String name;
    int age;
    double salary;
    comparator( String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void display(){
        System.out.println(name + " | " + age + " | " + salary);
    }
}

class empolye{
    public static void main (String []args){

         List<comparator> employees= new ArrayList<>();
         employees.add(new comparator("Arun", 25, 30000));
        employees.add(new comparator("Bala", 24, 25000));
        employees.add(new comparator("Priya", 22, 15000));
        employees.add(new comparator("kutty", 23, 40000));
        employees.add(new comparator("janani",21,10000));
        employees.add(new comparator("ishu",23,20000));
        employees.add(new comparator("dhanvika",25,30000));
        employees.add(new comparator("kavya",22,15000));

        employees.sort(
            Comparator.comparingDouble((comparator c) -> c.salary)
            .thenComparing (c-> c.name)
            .thenComparingInt(c-> c.age )

        );

        System.out.println("Name | Age | Salary");


        for (comparator e : employees) {
            e.display();
        }
    }
}

    
    

