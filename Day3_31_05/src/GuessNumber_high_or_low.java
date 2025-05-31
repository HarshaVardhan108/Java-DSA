import java.util.Scanner;

public class GuessNumber_high_or_low {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(guessNumber(n));
    }

    public static int guessNumber(int n) {
        int low = 1, high = n;
        int value = 0;
        while (low<=high) {
            int mid = (low + high)/2;
            value = guess(mid);

            if(value == 0) {
                return mid;
            } else if (value == 1) {
                low = mid + 1;
            } else if(value == -1) {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static int guess(int num) {
        int pick = 6;
        if(num < pick) return 1;
        if(num > pick) return -1;
        return 0;
    }
}