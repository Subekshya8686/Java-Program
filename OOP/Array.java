import java.util.Scanner;

public class Array {
    // int myArray[]; // declaring array
    // myArray = new int[5];
    // // Or
    // int[] intArray = new int[5];

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
//         System.out.print("How many you want to enter: ");
//         int size = sc.nextInt();
//         int[] numbers = new int[size]; // array initialization

//         // input
//         System.out.print("They are: ");
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         // output
//         System.out.println("The numbers you have entered are: ");
//         for (int i = 0; i < size; i++) {
//             System.out.println(numbers[i]);
//         }
//         sc.close();
//     }

////////////////////////////////////////////////////////////////////////////////////////////

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        // //declares an array of integers
        // int arr[];

        // // allocating memory for 5 integers
        // arr = new int[5];

        // for (int i = 0; i< arr.length; i++) {
        //     System.out.print("Enter a value: ");
        //     arr[i]= sc.nextInt();
        // }

        // int sum = 0;
        // // retrieving every elements and adding up

        // for (int i = 0; i< arr.length; i++) {
        //     sum += arr[i];  
        // }
        // System.out.println("The sum of an array: "+ sum);


        //////////////////////////////////////////////////////////////////////////////////////
       
        // // declaring an array and storing values    
        // int arr[];

        // // allocating memory for 5 integers
        // arr= new int[5];

        // for (int i=0; i< arr.length; i++) {
        //     System.out.print("Enter a value: ");
        //     arr[i] = sc.nextInt();
        // }

        // int even =0;
        // int odd = 0;
        // // retrieving every elements and checking if they are even
        // System.out.println("Enter numbers are: ");
        // for (int i=0; i<arr.length; i++) {
        //     if (arr[i] % 2==0)
        //         even += 1;
        //     else 
        //         odd += 1;
        // }
        // System.out.println("Number of even numbers are: " + even);
        // System.out.println("Number of odd numbers are: " + odd);


//////////////////////////////////////////////////////////////////////

        // // declaring an array and storing values    
        // int arr[];

        // // allocating memory for 5 integers
        // arr= new int[5];
            
        // for (int i=0; i< arr.length; i++) {
        //     System.out.print("Enter a value: ");
        //     arr[i] = sc.nextInt();
        // }
        
        // int sum = 0;
        // // retrieving every elements and adding up

        // for (int i = 0; i< arr.length; i++) {
        //     sum += arr[i];  
        // }
        // System.out.println("The sum is: " + sum);

        // double Avg = 0;
        // for (int i = 0; i<arr.length; i++) {
        //     Avg = sum/arr.length;
        // }
        // System.out.println("The average of entered numbers are: " +Avg);
        // sc.close();

        // ////////////////////////////////////////////////////////////////////////////////

        Scanner input = new Scanner(System.in);
          // declaring an array and storing values    
          int arr[]= {2,4,6,8,10};

          // Ask user for a value to search 
          System.out.print("Enter a value:");
          int value = input.nextInt();
              
          // check if the array contains the specified value
          int index = -1;
          for (int i=0; i<arr.length; i++) {
            if(arr[i] == value) {
                index = i;
                break;
            }
          }

          // print the result
          if (index>=0) {
            System.out.println("The array contains the value "+ value+ " at index "+ index); 
          } else {
            System.out.println("The array does not contain the value " + value);
          }
          input.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////

