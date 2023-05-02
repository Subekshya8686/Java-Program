package Test;

//  Write a program that takes a single number as input, 
// adds up all the smaller non-prime numbers than the input number, and returns 
// the result. If either all the numbers are prime or the input number is less than 0, 
//the output should be 0. Remember to include break and continue statements in your code.

import java.util.Scanner;

public class Q1 {
    int num;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        
        System.out.println(num);
        input.close();
    }
    
    void prime(){
        Scanner key = new Scanner(System.in);
        int i = 0;
        int a = 0;
        while (i<a){
            for (i=0; i<=a;i++){
                int n= key.nextInt();
                int count = 0;
            for(int div=1; div<=a; div++){
                if (n%div==0) {
                    count++;
            }
        }
            if (count==2){
                System.out.println("Prime");

        }}
        
        key.close();
        }
        
    }
}

