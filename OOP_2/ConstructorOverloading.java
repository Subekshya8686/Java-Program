package OOP_2;

class Base{
    Base(){
        System.out.println("I am default constructor");
    }
    Base(int a){
        a=10;
        System.out.println("I am parameterized constructor");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("I am a child constructor");
    }
}



public class ConstructorOverloading {
    public static void main(String[] args) {
        // Derived d =new Derived();
        
    }
}  
