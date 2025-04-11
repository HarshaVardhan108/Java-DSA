import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = sum / arr.length;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(avg);
        sc.close();
    }
}
