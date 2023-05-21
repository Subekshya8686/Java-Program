import java.util.ArrayList;
import java.util.Collections;

public class StringArray {
    public static void main(String[] args) {
        ArrayList<String>Animal = new ArrayList<>();

        Animal.add("Dog");
        Animal.add("Cat");
        Animal.add("Horse");
        Animal.add("Cow");
        Animal.add("Parrot");
        Animal.add("Pigeon");
        Animal.add(6, "Wolf");;
        System.out.println(Animal);

        // get or access an element
        String element = Animal.get(5);
        System.out.println(element);

        // change an element
        String chn= Animal.set(3, "Beaver");
        System.out.println("Changed element: " + chn);
        System.out.println("Updated list: "+ Animal);

        // remove an element
        String r = Animal.remove(5);
        System.out.println("Removed element: "+ r);
        System.out.println("Updated list: "+ Animal);

        // Animal.add(5, "Pigeon");
        // System.out.println(Animal);

        Collections.sort(Animal);
        System.out.println("The sorted arraylist: " + Animal);

    }
}