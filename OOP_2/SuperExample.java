package OOP_2;

class Base2{
    int a=10;
    void show(){
        System.out.println("It's base class here.");
    }
}

class Child2 extends Base2{
    int a =20;
    void show(){
        System.out.println("The value of a is: "+a);
        // System.out.println(super.a);  // refer to the immediate parent class
        super.show();  // refer to the immediate parent method
    }
}


public class SuperExample {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.show();
    }    
}
