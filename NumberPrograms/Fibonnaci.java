package NumberPrograms;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println(res);
//        int a = 0;
//        int b = 1;
//        int temp = 0;
//        while(n != 0) {
//            temp = a+b;
//            System.out.print(a + " ");
//            System.out.println();
//            a = b;
//            b = temp;
//            temp = a;
//            n--;
//        }
//        System.out.println(n + "th Number is " + temp);
    }

    //Using recursive method
    public static int fib(int n) {
        if (n == 0 || n == 1) return n;

        return fib(n-1) + fib(n-2);
    }

}