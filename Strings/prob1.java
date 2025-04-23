package Strings;

import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s2 = new String("world");
//        String s1 = "World";
//        System.out.println(s2.concat(s2));

        //Strings are immutable
//
//        String s1 = "hi";
//        s1 = s1.("java");
//        System.out.println(s1); // Print NOTE:hi java

        //Using StringBuffer
//        String input1 = sc.nextLine();
//        String input3 = sc.nextLine();
//        String input2 = sc.nextLine();
//        StringBuffer s1 = new StringBuffer(input1);
//        StringBuffer s2 = new StringBuffer(input2);
//        StringBuffer s3 = new StringBuffer(input3);
//
//        System.out.println(s1.append(s2).append(s3));

//        int index = sc.nextInt();
        String input2 = sc.nextLine();
        StringBuffer s = new StringBuffer(input2);
        StringBuffer rev = s.reverse();
        if (input2.equals(rev.toString())) {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not");


    }
}
