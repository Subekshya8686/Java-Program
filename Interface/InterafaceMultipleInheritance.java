package Interface;

interface Movable{
    void moveLeft();
    void moveRight();
    void moveUp();
    void moveDown();
}

interface Resizables{
    void resize(int percentage);
}

interface Rotatable{
    void rotateLeft();
    void rotateRight();
}

class Shape implements Movable, Resizables, Rotatable{
    public void moveLeft(){
        System.out.println("Shape moved left.");
    }

    public void moveRight(){
        System.out.println("Shape moved right.");
    }

    public void moveUp(){
        System.out.println("Shape moved up");
    }

    public void moveDown(){
        System.out.println("Shape moved down.");
    }

    public void resize(int percentage){
        System.out.println("Shape resized by "+ percentage+ "%");
    }

    public void rotateLeft(){
        System.out.println("Shape rotated left.");
    }

    public void rotateRight(){
        System.out.println("Shape rotated right.");
    }
}

public class InterafaceMultipleInheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.moveLeft();
        shape.moveRight();
        shape.moveDown();
        shape.moveUp();
        shape.resize(50);
        shape.rotateRight();
        shape.rotateLeft();
    }
}