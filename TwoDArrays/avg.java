package TwoDArrays;

import java.util.Scanner;

public class avg {
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
        System.out.println("Array:");
        for (rows = 0; rows < arr.length; rows++) {
            for (col = 0; col < arr[0].length; col++ ) { 
                System.out.print(arr[rows][col]+ " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (rows = 0; rows < arr.length; rows++) {
            for (col = 0; col < arr[0].length; col++) {
                sum = sum + arr[rows][col];
            }
        }

        System.out.println("");


    }
}
