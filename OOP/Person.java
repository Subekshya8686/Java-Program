// showing name and age in class
public class Person {
    // instance variables
    String name; 
    int age;
    

    // method to display information about the person
    public void displayInfo() {      //methods
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }

    // main method to create objects and call methods

    public static void main(String[] args) {
        // create first person object
        //classname objectname = new(operator) classname()
        Person person1 = new Person();
        // set vales of instance variables diresctly

        //person.name = input.nextLine();
        person1.name= "John";
        person1.age= 25;
        // call displayInfo method to print out information about person1
        person1.displayInfo();

        //create second person object
        Person person2 = new Person();
        //set value of instance variables directly
        person2.name = "Jane";
        person2.age = 30;
        // call displayInfo method to print out information about person2
        person2.displayInfo();
    }
}
