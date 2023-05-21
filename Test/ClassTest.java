package Test;

import java.util.Scanner;

public class ClassTest {
    int[] arr = new int[6];

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    int[] numbers = new int[6];

    int i;
    //  input
    System.out.println("The elements are: ");
    for(i=0; i<6; i++){
        numbers[i] = sc.nextInt();
        sc.close();
    }

    System.out.println("The numbers you have entered are: ");
        for (i = 0; i < 6; i++) {
            System.out.println(numbers[i]);
        }

    for (i=0;i<6;i++){

    }
    
    
    }
}

