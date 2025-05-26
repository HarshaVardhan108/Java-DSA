package CollectionFrameworks;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        TreeSet set = new TreeSet();


        for (int i = 0; i < n; i++) {
            String instruction = sc.nextLine();
            if(instruction.equals(" ")) {
                String[] ins = instruction.split(" ");
                String in = ins[0];
                String el = ins[1];
                if(in.equals("ADD")) {
                    set.add(el);
                }
                else if(in.equals("REMOVE")) {
                    set.remove(el);
                } else if (in.equals("CHECK")) {
                    if(el.contains(el)) {
                        System.out.println("YES");
                    }
                    else
                        System.out.println("NO");
                }
            }
            else {
                if(instruction.equals("FIRST")) {
                    System.out.println(set.getFirst());
                } else if (instruction.equals("LAST")) {
                    System.out.println(set.getLast());
                } else if (instruction.equals("PRINT")){
                    for (Object obj : set) {
                        System.out.println(set);
                    }
                }
            }
        }
    }

}