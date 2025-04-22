public class findMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,4,5,2,3,6};

        int res = findnumber(arr, arr.length+1);
        System.out.println(res);
    }

    public static int findnumber(int[] nums, int n) {
        int sum = (n*(n+1))/2;

        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];

        }
        return sum;
    }
}
