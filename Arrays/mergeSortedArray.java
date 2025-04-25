import java.util.Arrays;
import java.util.Scanner;

public class mergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] mergedArr = new int[m+n];
        int i = 0, j =0 , k = 0;
        while(i < m && j < n) {
                if(nums1[i] < nums2[j]) {
                    mergedArr[k++] = nums1[i++] ;
                } else {
                    mergedArr[k++] = nums2[j++];
                }
        }

        while (i < m) mergedArr[k++] = nums1[i++];
        while (j < n) mergedArr[k++] = nums2[j++];

        System.out.println(Arrays.toString(mergedArr));

    }
}
