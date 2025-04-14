import java.util.Arrays;
import java.util.Scanner;

public class containsDuplicates {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    boolean res = findDup(arr);
    System.out.println(res);
    
}

public static boolean findDup(int[] arr) {
Arrays.sort(arr);
    for (int i = 1; i < arr.length; i++) {
        
            if (arr[i] == arr[i-1]) {
                return true;
            }
        }
    
    return false;
}

}
