package OOP_2;

class ParentA{
    protected String parentField;
    protected void parentMethod(){
        System.out.println("Parent Method");
    }
}

class ChildA extends ParentA{
    public void childMethod(){
        System.out.println("");
    }
}

public class ExampleProtected {
    
}
