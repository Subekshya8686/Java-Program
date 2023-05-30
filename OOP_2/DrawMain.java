package OOP_2;
abstract class Draw{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

//  child class created
class Rectangle extends Draw{
    private double length, breadth;

    Rectangle (double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLengthBreadth(double length, double breadth){
        this.length = length;
        this.breadth= breadth;
    }
    
    public double getLength(){
        return length; 
    }

    public double getBreadth(){
        return breadth;
    }

    @Override
    public double calculatePerimeter(){
        return 2*(length+breadth);
    }

    public double calculateArea(){
        return (length*breadth);
    }
}

class Triangle extends Draw{
    private double base, height;
    private double sideA, sideB, sideC;

    Triangle (double base,double height, double sideA, double sideB, double sideC){
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setBaseHeight(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public void setSides(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double getSideC(){
        return sideC;
    }

    @Override
    public double calculateArea(){
        return (0.5)*base*height;
    }

    public double calculatePerimeter(){
        return sideA+sideB+sideC;
    }
}

public class DrawMain{
    public static void main(String[] args) {
        Draw rectangle = new Rectangle(8,3);
        // rectangle.calculateArea();
        // rectangle.calculatePerimeter();
        System.out.println("Area of rectangle: "+ rectangle.calculateArea());
        System.out.println("Perimeter of rectagle: "+ rectangle.calculatePerimeter());

        Draw triangle = new Triangle(2,5,3,4,5);
        System.out.println("Area of triangle: "+ triangle.calculateArea());
        System.out.println("Perimeter of triangle: "+ triangle.calculatePerimeter());
    }
}