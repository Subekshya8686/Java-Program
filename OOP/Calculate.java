class Cube{
    int length;
    int breadth;
    int height;

    //  paramterized constructor
    Cube(int l,int b,int h){
        length =l;
        breadth=b;
        height=h;
    }

    double Volume(){
        return length*breadth*height;
    }
}

public class Calculate{
    public static void main(String[] args) {
        Cube a = new Cube(12,11, 5); // paramterized constructor
        // a.length = 12;
        // a.breadth = 11;
        // a.height = 5;

        System.out.println("The volume of cube is: "+ a.Volume());
    }
}
