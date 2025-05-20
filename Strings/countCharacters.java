package Strings;

import java.util.Scanner;

public class countCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String ch = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == ch.charAt(0)) {
                count++;
            }
        }
        System.out.println("The character " + ch + " occurs " + count);
        sc.close();
    }
    
}
