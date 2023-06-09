package Interface;

interface Calculator{
    double add();
    double subtract();
    double multipy();
    double divide();
}

class BasicCalculator implements Calculator{
    public double a,b;

    public void measure(double a, double b){
        this.a = a;
        this.b= b;
    }

    public double add(){
        return a+b;
    }

    public double subtract(){
        return a-b;
    }

    public double multipy(){
        return a*b;
    }

    public double divide(){
        return a/b;
    }
}

public class CalculatorEG {
    public static void main(String[] args) {
        BasicCalculator cal = new BasicCalculator();
        cal.a = 4;
        cal.b = 2;
        System.out.println("Sum: "+ cal.add()); 
        System.out.println("Difference: "+cal.subtract());
        System.out.println("Product: "+cal.multipy());
        System.out.println("Division: "+cal.divide());
    }
}
