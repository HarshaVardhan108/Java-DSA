package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,2,4,8,9};

        for (int i = 0; i <arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j<arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }

            }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
        }

        
    }
}
