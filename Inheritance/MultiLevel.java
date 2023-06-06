package Inheritance;
// class Hierarchy{
//     protected int length, breadth, radius;
//     void Area(){
//     System.out.println("Area of the given shapes: ");
//     }
// }

// class Rectangles extends Hierarchy{
//     void AreaOfRectangle(){
//         length = 9; breadth = 5;
//         double area=  length*breadth;
//         System.out.println("The area of rectangle is: "+ area);
//     }
// }

// class Square extends Rectangles{
//     void AreaOfSquare() {
//         length = 8;
//         double Sarea= length*length;
//         System.out.println("The area of square is: "+ Sarea);
//     }
// }

// class Circles extends Square{
//     void AreaOfCircle(){
//         radius =5;
//         double Carea= Math.PI*radius*radius;
//         System.out.println("The area of circle is: " +Carea);
//     }
// }

// public class MultiLevel{
//     public static void main(String[] args) {
//         Circles c1 = new Circles();
//         c1.Area();
//         c1.AreaOfRectangle();
//         c1.AreaOfSquare();
//         c1.AreaOfCircle();
//     }
// }


class Hierarchy{
    protected int length, breadth, radius;
    void Area(){
    System.out.println("Area of the given shapes: ");
    }
}

class Rectangles extends Hierarchy{
    void AreaOfRectangle(){
        length = 9; breadth = 5;
        double area=  length*breadth;
        System.out.println("The area of rectangle is: "+ area);
    }
}

class Square extends Hierarchy{
    void AreaOfSquare() {
        length = 8;
        double Sarea= length*length;
        System.out.println("The area of square is: "+ Sarea);
    }
}

class Circles extends Hierarchy{
    void AreaOfCircle(){
        radius =5;
        double Carea= Math.PI*radius*radius;
        System.out.println("The area of circle is: " +Carea);
    }
}

public class MultiLevel{
    public static void main(String[] args) {
        Circles c1 = new Circles();
        // c1.Area();
        c1.AreaOfCircle();

        Rectangles r1 = new Rectangles();
        r1.AreaOfRectangle();

        Square s1= new Square();
        s1.AreaOfSquare();
    }
}