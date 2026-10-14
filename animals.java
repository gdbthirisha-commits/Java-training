// Inheritance and Method Overriding Using Animals, Dog, and Cat

public class animals {
    
    void sound(){
    System.out.println("animals make a sound");
}
}
class dog extends animals{
    @Override
    void sound(){
System.out.println("dog barks");
}
}

    class cat extends animals{
        @Override
        void sound(){
        System.out.println("cat meow");
    }
}
    class combine{
        public static void main (String []args){
            animals a= new animals();
            dog d=new dog();
            cat c=new cat();
            
            a.sound();
            d.sound();
            c.sound();
        }
    }
    

