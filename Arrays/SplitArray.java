import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
