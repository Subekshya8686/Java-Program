package Inheritance;

// single level inheritance
// class Vehicle {
//     String name;
//     String color;
//     String price;

//     void carDetail() {
//         System.out.println("***** The car Details ******");
//     }
// }

// class Car extends Vehicle {
//     void displays() {
//         name = "Honda";
//         color = "grey";
//         price = "10,00,000";

//         System.out.println("Name of the car: " + name);
//         System.out.println("Color of the car: " + color);
//         System.out.println("The price of the car: " + price);
//     }
// }

// public class ExampleInherit {
//     public static void main(String[] args) {
//         Car sc = new Car();
//         sc.carDetail();
//         sc.displays();
//     }
// }



// *************************************************************************************

//  multilevel inheritance

// class A2 {
//     int a,b,c;
//     void add(){
//         a=20; b=10;
//         c=a+b;
//         System.out.println("Addition of two numbers: "+ c);

//     }
// }

// // sub class
// class B2 extends A2 {
//     void sub(){
//         a=30 ; b=10;
//         c=a-b;
//         System.out.println("Subtraction of two numbers: "+ c);
    
//     }
//         void mul(){
//             a=30 ; b=10;
//             c=a*b;
//             System.out.println("Multiplication of two numbers: "+ c);
// }
// }

// class C2 extends B2{
//     void div(){
//         a = 20 ; b = 2;
//         c = a/b;
//         System.out.println("Division of two numbers: " + c);
//     }

//     void rem(){
//         a=15 ; b=2;
//         c=a%b;
//         System.out.println("Remainder of two numbers: "+ c);
//     }
// }

// public class ExampleInherit{
//     public static void main(String[] args) {
//         C2 value = new C2();
//         // Inheriting base class : A2 class
//         value.add();    
//         // Inheriting base class : B2 class
//         value.sub();
//         value.mul();
//         // methoding own properties
//         value.div();
//         value.rem();
//     }
// }


// ************************************************************************************************

// Hierarchal Inheritance

// class Shape2{
//    protected int length, breadth, base,height;
//     void Area(){
//         System.out.println("Area of different shapes: ");
//     }
// }

// class Rectangle2 extends Shape2{
//     @Override
//     void Area(){
//         double area = length* breadth;
//         System.out.println("Area of Rectangle: "+ area);
//     }
// }

// class Triangle2 extends Shape2{
//     @Override
//     void Area(){
//         double area = 0.5*base * height;
//         System.out.println("Area of Triangle: "+ area);
//     }
// }

// public class ExampleInherit{
//     public static void main(String[] args) {
//         //  for rectangle
//         Rectangle2 r = new Rectangle2();
//         r.length = 10;
//         r.breadth =4;
//         r.Area();

//         // for triangle
//         Triangle2 t = new Triangle2();
//         t.base = 5;
//         t.height = 9;
//         t.Area();
//     }
// }