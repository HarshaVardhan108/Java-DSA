package TwoDArrays;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] arr = new int[i][j];

        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[0].length; col++ ) { 
                arr[rows][col] = sc.nextInt();
            }
        }
        System.out.println("Array:");
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[0].length; col++ ) { 
                System.out.print(arr[rows][col]+ " ");
            }
            System.out.println();
        }

        
        for (int rows = 0; rows < arr.length; rows++) {
            double sum = 0.0, avg = 0.0;
            for (int col = 0; col < arr[0].length; col++) {
                sum = sum + arr[rows][col];
            }
            avg = sum / arr[rows].length;
            System.out.println("Average of"+ rows + " st row :" + avg);
        }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.println(arr[i][j]);
        //     }
        // }



    }
}
