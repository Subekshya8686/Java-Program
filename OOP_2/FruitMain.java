package OOP_2;
import java.util.Scanner;

// encapsulation = wraping of data + data hiding
class Fruit{   // wrapping data 
    private String name;
    private String color;
    private double price;
    private int quantity;

    // set and get
    public void setName(String name) {
        this.name = name;    
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color= color;
    }

    public String getColor(){
        return color;
    }

    public void setPrice(double price){
        this.price= price;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity= quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    // method to calculate cost

    double calculateCost(){
        return price * quantity;
    }
}

public class FruitMain{
    public static void main(String[] args) {
        // take user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the fruit: ");
        String name = sc.nextLine();

        System.out.println("Enter the color: ");
        String color = sc.next();

        System.out.println("Enter the price: ");
        double price= sc.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();

        // now createan object of the class fruit

        Fruit type = new Fruit();

        // set the values
        type.setName(name);
        type.setColor(color);
        type.setPrice(price);
        type.setPrice(price);
        type.setQuantity(quantity);

        // get the values and print it
        System.out.println("*********Fruits Details: ************");

        System.out.println("Name of fruit : "+ type.getName());
        System.out.println("Color of Fruit : "+ type.getColor());
        System.out.println("Price of Fruit : "+ type.getPrice());
        System.out.println("Quantity of Fruit : "+ type.getQuantity());
        System.out.println("Total Cost of Fruits: "+type.calculateCost());

        sc.close();

    }
}