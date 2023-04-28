// using scanner method in class

import java.util.Scanner;

public class Input {
    // // instance variables
    static String name; 
    static int age;
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        Input person1 = new Input();
            System.out.println("Enter your name: ");
            name = key.nextLine();

            System.out.println("Enter your age: ");
            age = key.nextInt();
            key.close();
            person1.displayInfo(); 
        }
            
            // method to display information about the person
            public void displayInfo() {
                System.out.println("Name: "+ name);
                System.out.println("Age: "+ age);
            }
        }