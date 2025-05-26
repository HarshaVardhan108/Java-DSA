package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a");
            int a = scanner.nextInt();
            System.out.println("Enter b");
            int b = scanner.nextInt();

            System.out.println("Output: " + a/b);
        } catch (InputMismatchException e) {
            System.out.println("Enter integer value only");
        } catch (Exception e) {
            System.out.println("Enter non zero number");
        }
    }
}