package leetcode;

public class Stairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = n; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }



    public static void main(String[] args) {
        int num = 4;
        System.out.println(climbStairs(num));
    }


}
