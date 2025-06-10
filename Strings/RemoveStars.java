package Strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Arrays.toString(removeStars(s)));
    }

    public static String[] removeStars(String s) {
        Stack stack = new Stack();

        for(Object obj : s.split(" ")) {
            if(s.contains("*")) {
                stack.pop();
            }
        }

        return s1;
    }
}