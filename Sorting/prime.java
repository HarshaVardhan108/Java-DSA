package Sorting;

import java.util.Scanner;

public class prime {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int count = 1;
    for (int i = 1; i < x; i++) {
        if (x % i == 0) {
            count++;
        }
    }

    if(count == 2) {
        System.out.println("Prime");
    } else {
        System.out.println("Not Prime");

    }
    sc.close();
 }   
}
