package Searching;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Given Array");
        int[] arr = {5,10,15,20};
        System.out.println("Enter element to search");
        int search = sc.nextInt();

        int res = linearSearch(arr, search);
        if (res != -1) 
            System.out.println("Element found at position: " + (res+1));
        else 
            System.out.println("Element not found");
        sc.close();
    }

    private static int linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
