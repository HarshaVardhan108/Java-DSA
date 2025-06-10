package CollectionFrameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            map.put(id,name);
        }

        int searchId = sc.nextInt();
        System.out.println(map.get(searchId));

        int deleteId = sc.nextInt();
        map.remove(deleteId);
        System.out.println(map);

    }
}