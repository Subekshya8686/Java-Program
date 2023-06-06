package Inheritance;
// class A{ // super class

//     protected String name;
//     protected int age;

//     void display(){
//         System.out.println("Name: "+name);
//         System.out.println("Age: "+age);
//     }
// }

// class B extends A{
//     String address;
//     void Info(){
//         System.out.println("Address: "+ address);
//     }
// }

// public class Inherit{
//     public static void main(String[] args) {
//         // A obj = new A();
//         // obj.name = "Ram";
//         // obj.age = 19;
//         // obj.display();

//         // object of class B
//         B obj2 = new B();
//         obj2.name = "Ram";
//         obj2.age = 19;
//         obj2.address = "USA";
//         obj2.display();
//         obj2.Info();
//     }
// }


// Single Inheritance
class A{
    int a,b,c;
    void add(){
        a=20; b=10;
        c=a+b;
        System.out.println("Addition of two numbers: "+ c);

    }
}

// sub class
class B extends A{
    void sub(){
        a=30 ; b=10;
        c=a-b;
        System.out.println("Subtraction of two numbers: "+ c);
    }
}

public class Inherit{
    public static void main(String[] args) {
        B obj = new B();
        obj.add(); // inherit properties of base class
        obj.sub(); //own method call
    }
}