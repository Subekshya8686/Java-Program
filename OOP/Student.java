//  make Student class and print the details like name,age,roll, address

import java.util.Scanner;

public class Student{
    static String name, adres;
    static int roll, age;
    
    public static void main(String[] args) {
        Student st = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your roll: ");
        roll = input.nextInt();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your address: ");
        adres = input.next();

        input.close();
        st.printInfo();
    }
        
        void printInfo(){ 
            System.out.println("\tStudent details");
            System.out.println("\tName: "+name);
            System.out.println("\tRoll No.: "+roll);
            System.out.println("\tAge: "+age);
            System.out.println("\tAddress: "+adres);
        }
}