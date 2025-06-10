package Day3_31_05.src;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueNoOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num+1,num) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
            }
        }
    }
}