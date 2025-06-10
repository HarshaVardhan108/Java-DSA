package CollectionFrameworks;

import java.util.WeakHashMap;

public class Weakhashmap {
    public static void main(String[] args) {
        Object key1 = "1001";
        Object value1 = "raj";
        Object key2 = "1002";
        Object value2 = "raja";

        WeakHashMap map = new WeakHashMap();
        map.put(key1,value1);
        map.put(key2,value2);

        System.out.println(map);
        key1 = null;
        System.gc();
        System.out.println(map);
    }
}