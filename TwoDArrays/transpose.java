package TwoDArrays;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];

        for (rows = 0; rows < arr.length; rows++) {
            for (col = 0; col < arr[0].length; col++ ) { 
                arr[rows][col] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");

        for (rows = 0; rows < arr.length; rows++) {
            for (col = 0; col < arr[0].length; col++ ) { 
               System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }

        for (rows = 0; rows < col; rows++) {
            for (col = 0; col < rows; col++ ) { 
               arr[col][rows] = arr[rows][col];
            }
        }

        System.out.println("Transpose Matrix");
        for (col = 0; col < arr[0].length; col++) {
            for (rows = 0; rows < arr.length; rows++ ) { 
               System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }
    }
}
