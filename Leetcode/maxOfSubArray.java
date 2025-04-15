package Leetcode;

public class maxOfSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int curSum = arr[0];
        int overSum = arr[0];

        NOTE://Kadane's algo
        for (int i = 1; i < arr.length; i++) {
            if ((curSum + arr[i]) > arr[i]) {
                curSum += arr[i];
            } else {
                curSum = arr[i];
            }
            if(curSum > overSum) 
                overSum = curSum;
        }

        System.out.println(overSum);

    }
}
