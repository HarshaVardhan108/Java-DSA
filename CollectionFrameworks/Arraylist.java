package CollectionFrameworks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist<I extends Number> {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("A");
//        list.add("b");
//        list.add("d");
//        System.out.println(list.size());
//        System.out.println(list);
//
//        list.add(2,"ab"); // shift the elements and place it
//        list.set(2,"A"); // removes an element at index and place it
//        System.out.println(list.size());
//        System.out.println(list);
//        Iterator itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        int a = sc.nextInt();
        String newString = sc.nextLine();
        list.add(a,newString);
        for(Object obj : list) {
            System.out.print(obj+" ");
        }
    }
}