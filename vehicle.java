// Multilevel Inheritance in Java – Vehicle, Car, and Electric Car

public class vehicle {
    String brand;
    vehicle (String brand){
    this.brand=brand;
}
    void display(){
    System.out.println("brand="+ brand);
    }
}
    class car extends vehicle{
        String model;
        
        car(String brand,String model){
            super(brand);
        this.model=model;
        }
    

        
            void display(){
            System.out.println("model="+model);
            System.out.println("brand="+brand);

        }

    }
    class electriccar extends car{
        int batterypower;
    
        electriccar(String brand,String model,int batterypower){
            super(brand,model);
        this.batterypower=batterypower;
        
        }
    
            void display(){
            System.out.println("brand="+ brand);
            System.out.println("model="+ model);
            System.out.println("battery power="+ batterypower);
        }
    }    

    class combine{
        public static void main(String []args){
        
        electriccar e=new electriccar("tesla","model 5",75);

        e.display();
        }
    }