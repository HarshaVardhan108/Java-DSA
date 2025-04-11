import java.util.Arrays;
import java.util.Scanner;

public class revArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        int rev[] = new int[size];
        for (int i = 0; i < rev.length; i++) {
            //Main logic
            NOTE: rev[i] = arr[size-1-i];
        }

        System.out.println("Reverse Array: " + Arrays.toString(rev));
        sc.close();
    }
}
