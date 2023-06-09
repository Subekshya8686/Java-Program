package Interface;

// // defining an interface
// interface Drawable{
//     void draw(); // by default its public+abstract method
// }

// // Implementing the class to use interface
// class Sphere implements Drawable{
//     public void draw(){
//         System.out.println("Drawing a circle");
//     }
// }

// public class InterfaceExample {
//     public static void main(String[] args) {
//         Drawable circle = new Sphere();    // can either put class or the interface
//         circle.draw();
//     }
// }


interface Drawable{
    double calculateArea();  // abstract method + public
    double calculatePerimeter();  // abstract method + public
}

//implementing an interface 
class Circle implements Drawable{
    private double radius;

    //parameterized constructor of circle class
    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}

class Rectangle implements Drawable{
    private double length,breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        return length*breadth;
    }

    public double calculatePerimeter(){
        return 2*(length+breadth);
    }
}

class Square implements Drawable{
    private double length;

    public Square(double length){
        this.length=length;
    }

    public double calculateArea(){
        return length*length;
    }

    public double calculatePerimeter(){
        return 4*length;
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Drawable c1 =new Circle(3);
        System.out.println("Circle Area: "+ c1.calculateArea());
        System.out.println("Circle Perimeter: "+c1.calculatePerimeter());

        Drawable r1 = new Rectangle(7, 5);
        System.out.println("Rectangle Area: "+ r1.calculateArea());
        System.out.println("Rectangle Perimeter: "+r1.calculatePerimeter());

        Drawable s1 = new Square(5);
        System.out.println("Square Area: "+ s1.calculateArea());
        System.out.println("Square Perimeter: "+s1.calculatePerimeter());
    }
}
