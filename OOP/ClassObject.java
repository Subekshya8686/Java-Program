// import java.lang.reflect.Method;

public class ClassObject {
    int num1 ;  // attributes or data field
    int num2 ;

    void sumMethod() {
        System.out.println("Enter the num1: " + num1);
        System.out.println("Enter the second number:  "+ num2 );
        int sum = num1 +num2;
        System.out.println("The sum is: " + sum);
    }

        public static void main(String[] args) {
            ClassObject obj = new ClassObject();   // object created
            
            // value is assigned
            obj.num1 = 10;
            obj.num2 = 20;

            // method
            obj.sumMethod();
    }
}