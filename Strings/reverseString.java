package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        for (int i = s1.length(); i > 0; i--) {
            System.out.print(s1.charAt(i-1));
        }
    }
}
