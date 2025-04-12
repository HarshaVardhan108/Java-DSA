package Sorting;
import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,42,22,11,44};

        System.out.println("Before Sorting"); 
        System.out.println(Arrays.toString(arr));
        System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length-1-i; j++) {
        //         if (arr[j] > arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        
        System.out.println("After Sorting"); 
       NOTE: Arrays.sort(arr);
        System.out.print("[");
        for (int i =0; i < arr.length;i++) {
            System.out.print(arr[i]);
            if (i == arr.length-1){
                System.out.println("]");
                break;
            }
            System.out.print(", ");
        }

    }
}
