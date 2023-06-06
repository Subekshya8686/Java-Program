package Abstraction;
abstract class Person{   // abstract class is created
    Person(){
        System.out.println("Abstract class of person is created");
    }

    public abstract void details();

    public void demo(){
        System.out.println("This is demo class");
    }
}

class Test extends Person{
    // void details(){}
    public void details(){
        System.out.println("I am child class");
    }
}


public class Abstraction{
    public static void main(String[] args) {
        // person p1 =new Person();
        // Test t1 = new Test();
        Person t1 = new Test();
        t1.details();
        t1.demo();
    }
}