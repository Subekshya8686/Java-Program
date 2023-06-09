package Interface;

interface Resizable{
    void resize(Double percentage);
}

class Rectangle2 implements Resizable{
    public double width,height;

    // public void rectangleMeasure() {   // only needed when variable is private
    //     this.width = width;
    //     this.height = height;
    // }

    public void resize(Double percentage){
        width = width*percentage/100;
        height = height*percentage/100;
    }
}

public class Size {
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2();
        r1.width = 5;
        r1.height = 4;
        System.out.println("Width: " + r1.width + " Height: "+ r1.height);

        //resizing
        double resize = 50;
        r1.resize(resize);
        System.out.println("After Resizing the value is: ");
        System.out.println("Width: " + r1.width + " Height: "+ r1.height);
    }
}
