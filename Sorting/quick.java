package Sorting;

import java.util.LinkedList;
// import java.util.TreeMap;

public class quick {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.clone();
        System.out.println(typeOf(list));
        
    }

    public static String typeOf(LinkedList<Integer> list) {
        return "LinkedList of Integers";
    }
}
