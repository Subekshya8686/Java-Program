package Interface;

import java.util.Scanner;

/*  write a java program to create an interface 'calculator' with methods 
'int add(int num1, num2)', 'int subtract(int num2, num1)', 'int multiply(int num1,num2)'
and 'int divide(int num1, num2)'. Implement a class 'BasicCalculator' that implementas
*/


interface Calculator{
    int add(int num1,int num2);
    int subtract(int num1,int num2);
    int multipy(int num1,int num2);
    int divide(int num1,int num2);
}

class BasicCalculator implements Calculator{
    public int num1,num2;

    public void measure(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(int num1,int num2){
        return num1+num2;
    }

    public int subtract(int num1,int num2){
        return num1-num2;
    }

    public int multipy(int num1,int num2){
        return num1*num2;
    }

    public int divide(int num1,int num2){
        return num1/num2;
    }
}

public class CalculatorEG {
    public static void main(String[] args) {
        BasicCalculator cal = new BasicCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum: "+ cal.add(num1, num2)); 
        System.out.println("Difference: "+cal.subtract(num1, num2));
        System.out.println("Product: "+cal.multipy(num1, num2));
        System.out.println("Division: "+cal.divide(num1, num2));

        sc.close();
    }
}
