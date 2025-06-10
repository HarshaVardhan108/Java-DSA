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

//        for (int i = 0; i < arr.length; i++) {
//            String s = "";
//            for (int j = i; j < arr.length; j++) {
//                s = s + " "+ arr[j];
//                System.out.print(s);
//                System.out.println();
//            }
//            System.out.println();
//        }
        int minSum = arr[0];
        int maxSub = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxSub = Math.max(maxSub + arr[i], arr[i]);
            minSum = Math.min(maxSub, minSum);
        }

        System.out.println(minSum);
    }
}