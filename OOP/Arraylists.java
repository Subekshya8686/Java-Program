import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // creating an arraylist of an integer
        ArrayList<Integer>number = new ArrayList<>();

        // add an number
        number.add(1);
        number.add(2);
        number.add(2, 5);
        System.out.println("List of added numbers are "+ number);

        // get or access an element
        int element = number.get(2);
        System.out.println("Entered element is: "+ element);


        // set or change an element set() method
        number.set(0, 4);
        System.out.println("The changed element is: "+ number);

        // remove an element: remove()
        number.remove(0);
        System.out.println("The removed element "+ number);

    }
        
}
