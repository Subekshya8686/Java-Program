import java.util.Scanner;

public class Sorting{
    public static void main(String[] args) {
        int i,j;
        // array declaration and memory allocation
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        // input process
        System.out.println("Enter the 5 integers in an array: ");
        for(i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            sc.close();
        }
        
        // calculation for sorting ascending process
        for(i=0; i<arr.length; i++){
            for(j=0;j<arr.length; j++){
                if(arr[i] < arr[j]){
                    // swapping process is done here
                    // we need temp variable to store the temporary values
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                }
            }
        }

        // calculation for sorting descending process
        for(i=0; i<arr.length; i++){
            for(j=0;j<arr.length; j++){
                if(arr[i] > arr[j]){
                    // swapping process is done here
                    // we need temp variable to store the temporary values
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                }
            }
        }

        // output process
        System.out.println("Sorting in ascending order: ");
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
    }
    System.out.println();

        // output process
        System.out.println("Sorting in descending order: ");
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    System.out.println();

    for(i=0; i<6; i++){
        
    } 
    }
}