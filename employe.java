// Employee Details Using Encapsulation and Getters & Setters

public class employe {
    private  String name;
    private int age;
    private double salary;

    public void setname(String name){
        if(name!= null&& !name.isEmpty()){
            this.name =name;
        }
        else{
            System.out.println("invalid name");
        }
    }
        public String getname(){
            return name;
        }
    
 
    public void setage(int age){
        if(age>=18 && age<= 60){
            this.age=age;
        }

        else{
            System.out.println("invalid age");
        } 
    }
        public int getage(){
        
        return age;
        }
    }
         class Main{
        public static void main (String[]args){
            employe e=new employe();
            e.setname("Thirisha");
            e.setage(21);

            System.out.println("employe name=" +e.getname());
            System.out.println("employe age=" + e.getage());


        }
       }
        

        


    
    

