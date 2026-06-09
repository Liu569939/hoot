public class forfifteenC {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            int temp = Integer.MAX_VALUE / 2;
            Arrays.fill(dp, temp);
            dp[0] = 0;
            for(int num : coins){
                for(int i = num; i <= amount; i++){
                    dp[i] = Math.min(dp[i], dp[i-num] + 1);
                }
            }

            return dp[amount] == temp ? -1 : dp[amount];
        }
    }
}
