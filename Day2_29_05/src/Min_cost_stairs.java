import java.util.Scanner;


public class Min_cost_stairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < cost.length; i++) {
            cost[i] = scanner.nextInt();
        }

        System.out.println(minCostClimbingStairs(cost));

    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        int n = cost.length;

        for (int i = 2; i < cost.length+1; i++) {
            dp[i] = Math.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
        }
            return dp[n];
    }
}