package Strings;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String ch = sc.nextLine();
//        StringBuffer stringBuffer = new StringBuffer();

        System.out.println(input.indexOf(ch));
    }
}
