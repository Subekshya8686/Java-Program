class Students1{
    // instance variable
    String name;
    int age;

    // method
    void printdetails() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}

// main class
public class StudentInfo{
    public static void main(String[] args) {
        //  object is created
        Students1 s1= new Students1();

        s1.name = "Ram";
        s1.age = 25;

        // method call
        s1.printdetails();

    }
}