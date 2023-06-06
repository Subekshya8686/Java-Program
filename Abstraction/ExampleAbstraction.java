package Abstraction;
abstract class Shaper{
    public abstract void calArea();
}

class Squared extends Shaper{
    double length = 5;

    @Override
    public void calArea(){
        double area = length*length;
        System.out.println("Area of square: "+area);
    }

    public double calPerimeter(){
        return 4*(length);
    }
}

class Triangled extends Shaper{
    double base=6, height= 7;

    @Override
    public void calArea(){
        double area =0.5*base*height;
        System.out.println("Area of triangle: "+ area);
    }
}

public class ExampleAbstraction {
    public static void main(String[] args) {
        Squared s1 = new Squared();
        s1.calArea();
        System.out.println("Perimeter of square:"+s1.calPerimeter()); 

        Triangled t1 = new Triangled();
        t1.calArea();
    }
}
