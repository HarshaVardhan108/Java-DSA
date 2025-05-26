package CollectionFrameworks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraydeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();

        int n = sc.nextInt();
        sc.nextLine();
        int[] ratings = {};
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
//            list.add(sc.nextInt());
        }

        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            list.remove(sc.next());
        }



        System.out.println(String.join(", ", list));
    }
}