import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(countingBits(n)));
    }

    public static int[] countingBits(int n) {
        int[] countOnes = new int[n + 1]; // Array to store count of 1's for each number

        for (int i = 0; i <= n; i++) {
            int temp = i;
            int count = 0;

            // Count 1's in binary representation of i
            while(temp > 0) {
                if(temp % 2 == 1) {  // If the remainder is 1
                    count++;
                }
                temp = temp / 2;
            }

            countOnes[i] = count; // Store count for number i
        }
        return countOnes;
    }
}