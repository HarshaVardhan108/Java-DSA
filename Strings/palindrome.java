package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        StringBuffer stringBuffer = new StringBuffer(s1);
        StringBuffer s2 = stringBuffer.reverse();
        if (s2 == stringBuffer)
             System.out.println("Palindrome");
        else
             System.out.println("Not Palindrome");
    }
}
