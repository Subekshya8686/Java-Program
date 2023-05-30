package OOP_2;
import java.util.Scanner;

class Circle1{
    public double radius;
    // Scanner input = new Scanner(System.in);

    Circle1 (double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double Area(){
        return Math.PI*radius*radius;
    }

    public double Circumference(){
        return 2*Math.PI*radius;
    }
}

public class CircleSG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        
        System.out.println("Enter the radius of circle: ");
        double radius= sc.nextDouble();
    
        Circle1 obj = new Circle1(radius);

        // obj.setRadius(radius);
        
        System.out.println("Radius of circle: "+ obj.getRadius());
        System.out.println("The area is "+ obj.Area());
        System.out.println("The circumference is: "+ obj.Circumference());


        // updation
        System.out.println("Enter the radius of new circle: ");
        double newRadius = sc.nextDouble();

        obj.setRadius(newRadius);

        System.out.println("new circle Radius: "+ obj.getRadius());
        System.out.println("Updated Area of Circle: "+obj.Area());
        System.out.println("Updates Circumference of the circle: "+obj.Circumference());

        sc.close();


    }
}