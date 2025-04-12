package Searching;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Given Array");
        int[] arr = {5,10,15,20};
        System.out.println("Enter element to search");
        int search = sc.nextInt();

        int res = binarySearch(arr, search);
        if (res != -1) 
            System.out.println("Element found at position: " + (res+1));
        else 
            System.out.println("Element not found");
        sc.close();
    }

    private static int binarySearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == search) {
                return mid;
            } else if(arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
        
    }
}
