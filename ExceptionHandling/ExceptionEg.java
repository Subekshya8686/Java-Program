package ExceptionHandling;

public class ExceptionEg {
    // try-catch error
    public static void main(String[] args) {
        try{
        int a= 10,b =0;
        int c =a/b;  //Exception here
        System.out.println(c);}

        catch(ArithmeticException e ) {
            System.out.println("Divisible by zero");
        }
        catch(NullPointerException e){
            System.out.println("Null exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }
        finally{
            System.out.println("Finally block");
        }
        System.out.println("Out of try catch bounds...");
    }


    // public static void main(String[] args) {
        
    // }
}
