
package Test;

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary= sc.nextInt();

        int hra;
        int da;
        // int ssf;

        hra = (int) (salary*0.2); 
        System.out.print("HRA= "+ hra);

        da= (int) (salary*0.8);
        System.out.print("DA= "+ da);

        sc.close();

    }
}