package Strings;

import java.util.Scanner;

public class linearSearchStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i <size; i++) {
            names[i] = sc.nextLine();
        }

        for (String str : names) {
            System.out.println(str);
        }

    }
}
