import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                int i = 0;
                int sum = 0;
                while ( i < 100) {
                    sum = sum + i;
                    sum = i + sum;
                    i += 1;
                    System.out.println(sum);
                }

                System.out.println("Sum: " + sum);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a size: ");
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//      armstrong(num);
//      reverse(num);
//        fibonacci(num);
//        max(arr);
    }

    public static void max(int[] num) {
        int low = 0;
        int high = num.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(num[mid] == num[mid + 1]) {
                high = mid;
            }
            else
                low = mid + 1;
        }
        System.out.println("Maximum number is: " + num[low]);

    }

    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series: ");
        while(a <= num) {
            int temp = a + b;
            System.out.print(a + " ");
            a = b;
            b = temp;
//            temp = a;
        }
    }


    public static void reverse(int num) {
        int rev = 0;
        while (num!= 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse number is " + rev);
    }


    public static void armstrong(int num) {
        int temp = num;
        int sum = 0;
        while(num!=0) {
            int digit = num % 10;
            sum += digit*digit*digit;
            num /= 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is a armstrong number.");
        } else {
            System.out.println(temp + " is not a armstrong number.");
        }

    }

}