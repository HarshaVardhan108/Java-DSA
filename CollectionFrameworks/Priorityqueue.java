package CollectionFrameworks;


import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue coll = new PriorityQueue();
        coll.add(20);
        coll.add(10);
        coll.add(2);
//        coll.add("six"); Not support heterogeneous inputs
        System.out.println(coll);

    }

}