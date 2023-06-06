package Classwork;
abstract class Employee{
    public abstract void calculateSalary();
}

class Manager extends Employee{
    @Override
    public void calculateSalary(){
        double salary = 40000;
        System.out.println("Salary for Manager is: "+salary);
    }
} 

class Worker extends Employee{
    @Override
    public void calculateSalary(){
        double salary = 30000;
        System.out.println("Salary for Worker is: "+ salary);
    }
}

public class Company {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculateSalary();

        Worker w = new Worker();
        w.calculateSalary();
    }
}
