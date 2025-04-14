package TwoDArrays;

import java.util.Scanner;

public class sumOfMin {
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

        System.out.println("Array: ");

        for (rows = 0; rows < arr.length; rows++) {
            for (col = 0; col < arr[0].length; col++ ) { 
               System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }

        int sumOfMin = 0;
        // System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {

                // Condition for finding min element
                if (arr[i][j]< min) {
                    min = arr[i][j];
                }

            }
            sumOfMin += min;
            System.out.println("Minimum of row " + i + ": " + min);
        }
        System.out.println("Sum of minimum elements: " + sumOfMin);

// For finding max element in 2d arrays and sum of all max values in each row
        int sumOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][arr.length-1];
            for (int j = 0; j < arr[i].length; j++) {

                // Condition for finding min element
                if (arr[i][j]> max) {
                    max = arr[i][j];
                }

            }
            sumOfMax += max;
            System.out.println("Minimum of row " + i + ": " + max);
        }
        System.out.println("Sum of minimum elements: " + sumOfMax);
    }
}
