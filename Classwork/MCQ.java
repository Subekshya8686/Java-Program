package Classwork;

// class A{
//     public void print(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     public void print(){
//         System.out.println("B");
//     }
// }

// public class MCQ {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.print();
//     }
// }


// class A{
//     public A(){
//         System.out.println("A");
    // }
    // public void B(){
    //     System.out.println("B");
    // }
// }

// class B extends A{
//     int a;
//     public B(){
//         super();
//         System.out.println(a);
//     }
// }

// public class MCQ{
//     public static void main(String[] args) {
//         B obj = new B();
//         // System.out.println("The constructor");
//         obj.a=1;
//     }
// }

// public class MCQ{
//     public static void main(String[] args) {
//         Parent obj1= new Parent();
//         Parent obj2= new Child();
//         obj1.printMessage();
//         obj2.printMessage();

//     }
// }

// class Parent{
//     public void printMessage(){
//         System.out.println("Parent");
//     }
// }

// class Child extends Parent{
//     public void printMessage(){
//         System.out.println("Child");
//         super.printMessage();
//     }
// }

// class A{
//     public A(){
//         System.out.println("A");
//     }
//     public A(int x){
//         System.out.println("hello");
//     }
// }

// class B extends A{
//     public B(){
//         super(1);
//         System.out.println("B");
//     }
// }

// public class MCQ{
//     public static void main(String[] args) {
//         B obj = new B();
        
//     }
// }

// abstract class v{
//     private String brand;

//     public v(String brand){
//         this.brand= brand;
//     }
//     public abstract void start();

//     public void displayBrand(){
//         System.out.println("brand:"+ brand);
//     }
// }

// class C extends v{
//     public C(String brand){
//         super(brand);
//     }
//     public void start(){
//         System.out.println("car");

//     }
// }

// public class MCQ{
//     public static void main(String[] args) {
//         C v = new C("toyota");
//         v.start();
//         v.displayBrand();
//     }
// }

