package OOP_2;

import java.util.Scanner;

class Simple{
    private double principle;
    private int time;
    private double rate;

    // get and set
    public void setPrinciple(double principle){
        this.principle = principle;
    }

    public double getPrinciple(){
        return principle;
    }

    public void setTime(int time){
        this.time = time;
    }

    public double getTime(){
        return time;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public double getRate(){
        return rate;
    }

    // calculate SI
    double SI(){
        return (principle*time*rate)/100;
    }
}

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Principle: ");
        double principle = sc.nextDouble();
        
        System.out.println("Time: ");
        int time = sc.nextInt();

        System.out.println("Rate: ");
        double rate = sc.nextDouble();

        Simple obj = new Simple();
        obj.setPrinciple(principle);
        obj.setTime(time);
        obj.setRate(rate);
        obj.SI();

        System.out.println("The Simple Interest is: "+ obj.SI() );
        
        sc.close();
    }
}