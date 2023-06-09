package Interface;

class Shapes{
    void calculateArea(int length, int breadth){
        double area = length*breadth;
        System.out.println("Area of rectangle: "+area); 
    }

    void calculateArea(double radius){
        double area = Math.PI*radius*radius;
        System.out.println("Area of circle: "+ area);
    }

    // void calculateArea(float base, float height){
    //     float area = base*height;
    //     System.out.println("Area of triangle:"+ area);
    // }

    void calculateArea(int length){
        double area= length*length;
        System.out.println("Area of square: "+ area);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        s1.calculateArea(5,3);
        s1.calculateArea(2.0);
        s1.calculateArea(5);
    }
}
