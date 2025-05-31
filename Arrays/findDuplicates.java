import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class findDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {2,2,1,1,1,2,2};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    continue;
                } else {
                    arr[i++] = arr[j++];
                }
            }
        }

        System.out.println(Arrays.toString(arr));



    }
}