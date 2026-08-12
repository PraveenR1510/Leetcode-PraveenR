// Last updated: 8/12/2026, 9:32:09 PM
class Solution {
    public int numSquares(int n) {
     int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }   
    }
