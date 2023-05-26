import java.util.Scanner;

class Circle1{
    public int radius;
    Scanner input = new Scanner(System.in);
    
    public int getRadius(){
        return radius;
    }

    public void setRadius(){
        System.out.println("Enter the radius of circle: ");
        int radius= input.nextInt();
        this.radius = radius;
    }

    public double Area(){
        return Math.PI*radius*radius;
    }
}

public class Circle{
    public static void main(String[] args) {
        Circle1 obj = new Circle1();
        obj.setRadius();
        obj.Area();

        System.out.println("The area is "+ obj.Area());
    }
}