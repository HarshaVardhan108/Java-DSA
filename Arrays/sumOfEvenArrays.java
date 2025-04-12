import java.util.Arrays;
import java.util.Scanner;

public class sumOfEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
         System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(sum);
        sc.close();
    }
}
