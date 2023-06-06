package OOP_2;

class ParentA{
    protected String parentField;
    protected void parentMethod(){
        System.out.println("Parent Method");
    }
}

class ChildA extends ParentA{
    public void childMethod(){
        parentField = "Child field"; // accessing and modifying the field of parent field
        System.out.println("Child Method");
        System.out.println(parentField);
    }

    @Override
    public void parentMethod(){
        System.out.println("Child method override parent method.");
    }
}

public class ExampleProtected {
    public static void main(String[] args) {
        ChildA c1 = new ChildA();
        c1.childMethod();
        c1.parentMethod();
    }
}
