import java.util.Arrays;

public class COPYoFMETHOD {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

//        int[] copy = Arrays.copyOf(arr, arr.length);
        int target = 10;
        int[] copy = new int[arr.length];
         System.arraycopy(arr, 0, copy, 0, arr.length-1);
        System.out.println(Arrays.toString(copy));
    }
}
