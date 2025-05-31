import java.util.Scanner;

public class Nth_tribonacci {
    public static class Nth_Tribonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(tribonacci(n));

        }

        public static int tribonacci(int n) {
            int a = 0, b = 1, c = 1;
            int temp = 0;
            while (n >0) {
                temp = a + b + c;
                //            System.out.println(a);
                a = b;
                b  = c;
                c = temp;
                temp = a;
                n--;
            }
            return temp;
        }
    }
}