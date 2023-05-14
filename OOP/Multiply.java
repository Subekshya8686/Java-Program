import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        // declare r1 and c1umn
        // int r1, c1;
        int r1,c1,r2,c2;
        //use scanner class for input
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the row and column for first matrix: ");
        r1= sc.nextInt();
        c1= sc.nextInt();
        
        //array declaration and memory alocation
        int [][]one = new int[r1][c1];
        // int [][]two = new int[r2][c2];
        
        int i,j;
        //for input process
        System.out.println("Input the value in array A: ");
        for (i=0; i<r1;i++){    //for accessing r1
            for(j=0;j<c1;j++){  //for accessing c1umn
                one[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the row and column for second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();


        int[][] two = new int[r2][c2];

        System.out.println("Input the value in array B ");
        for (i=0; i < r2; i++){   
            for(j=0;j < c2; j++){  
                two[i][j] = sc.nextInt();
            }
        }

        //  important condition to be checked
        if(c1 != r2){
            System.out.println("Multiplication is not possible");
            return;
        }
        

    //     for product calculation
    int[][] prod = new int[r1][c2];

    for(i = 0; i< r1; i++){
        for(j=0; j<c2; j++){
            for(int k=0; k<c1; k++){
                prod[i][j] += one[i][k]* two[k][j];
            }
        }
    }

        // //for output process to display the values we inserted
        // System.out.println("Array data are: ");
        // for (i=0; i<r1;i++){
        //     for(j=0;j<c1;j++){
        //         System.out.print(one[i][j]+ " ");
        //     }
        //     System.out.println();
        // }


        // System.out.println("Array B data are: ");
        // for (i=0; i<r2;i++){
        //     for(j=0;j<c2;j++){
        //         System.out.print(two[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        System.out.println("The matrix multiplication is: ");
        for(i= 0; i< r1; i++){
            for(j = 0; j< c2; j++){
                System.out.println(prod[i][j]+ " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}