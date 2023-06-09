package Interface;

class Shapee{
    void calculateArea(){
        System.out.println("Area Calculation");
    }
}

class Raectangle extends Shapee{
    @Override
    public void calculateArea(){
        double area = 4*5;
        System.out.println("Area of rectangle: "+area);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Raectangle r1 = new Raectangle();
        r1.calculateArea();
    }
}