import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // declare row and column
        int row, col;
        //use scanner class for input
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter row: ");
        row= sc.nextInt();
        System.out.println("Enter col: ");
        col= sc.nextInt();

        //array declaration and memory alocation
        int [][]arr = new int[row][col];
        int [][]arr2 = new int[row][col];

        //for sum 
        int [][]sum = new int[row][col];

        //for multiplication
        // int [][]mul= new int[row][col];
        
        //for loop(row and column) we need i and j 

        int i,j;
        //for input process
        System.out.println("Input the value in array A ");
        for (i=0; i<row;i++){    //for accessing row
            for(j=0;j<col;j++){  //for accessing column
                arr[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Input the value in array B ");
        for (i=0; i<row;i++){    //for accessing row
            for(j=0;j<col;j++){  //for accessing column
                arr2[i][j]=sc.nextInt();
            }
        }


        //for sum calculation
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                sum[i][j] = arr[i][j]+arr2[i][j];

            }
        }

        // //for multiplication
        // for(i=0;i<row;i++){
        //     for(j=0;j<col;j++){
        //         mul[i][j] = arr[j][i]*arr2[i][j];
        //     }
        // }

        //for output process to display the values we inserted
        System.out.println("Array data are: ");
        for (i=0; i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


        System.out.println("Array B data are: ");
        for (i=0; i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The matrix addition is: ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

        // System.out.println("The matrix multiplication is: ");
        // for(i=0;i<row;i++){
        //     for(j=0;j<col;j++){
        //         System.out.print(mul[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}