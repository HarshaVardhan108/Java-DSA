import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }

        System.out.println("Maximum element in array is: " + max);
        sc.close();

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min= arr[i];
            }
        }

        System.out.println("Minimum element in array is: " + min);
        sc.close();

    }
}
