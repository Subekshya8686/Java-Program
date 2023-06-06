package Abstraction;
abstract class Shape{
    public abstract double calculateArea();
    // public abstract double calculateCircumference();
}

// child class is created
class Circle extends Shape{
    private double radius;

    //  constructor
    Circle(double radius){
        this.radius= radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(double radius){
        return radius;
    }

    // Overriding the method of super class by child class
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }
}


public class Abstraction1{
    public static void main(String[] args) {
        Shape c1 = new Circle(5);
        System.out.println("Area of circle: "+ c1.calculateArea());

        // System.out.println("Circumference of circle: " +c1.calculateCircumference());
        System.out.println("Circumference of circle: " +((Circle)c1).calculateCircumference());
    }
}