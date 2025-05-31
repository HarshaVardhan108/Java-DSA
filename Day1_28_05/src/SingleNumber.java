import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(singleNum(arr));

    }

    public static int singleNum(int[] nums) {
        int result = 0; // initialising number
        // Looping through an array

        for (int i = 0; i < nums.length; i++) {
            // Performing xor operation
//            i = 0: nums[0] = 4
//            result = 0 ^ 4 = 4

//            i = 1: nums[1] = 2
//            result = 4 ^ 2 = 6
//
//            i = 2: nums[2] = 1
//            result = 6 ^ 1 = 7
//
//            i = 3: nums[3] = 2
//            result = 7 ^ 2 = 5
//
//            i = 4: nums[4] = 1
//            result = 5 ^ 1 = 4
//            XOR operation has a special property: a ^ a = 0 and a ^ 0 = a
//            commonly used in problems where all elements appear twice except one.
            result = result ^ nums[i];
        }
        return result;
    }
}