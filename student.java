// Student and Employee Details Using Classes and Objects in Java

public class student {

    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displystudent() {
        System.out.println("student name: " + name);
        System.out.println("student age: " + age);
    }

    public static void main(String[] args) {

        student s1 = new student("arun", 21);

        s1.displystudent();

        System.out.println();
    }
}
        class employe {

        String name;
        double salary;

        employe(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void displyemploye() {
            System.out.println("employe name: " + name);
            System.out.println("employe salary: " + salary);
        }
        
    

    public static void main(String[] args) {

     employe e1 = new employe("janani", 15000);
     employe e2=new employe("thirisha",15000);

        e1.displyemploye();
        e2.displyemploye();

        System.out.println();
    }


    
    }

    

    

