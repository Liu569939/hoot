public class sixsevenB {
    //hoot 72 编辑距离
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];

        for(int i = 0; i <= n; i++){
            dp[i][0] = i;
        }
        for(int j = 0; j <= m; j++){
            dp[0][j] = j;
        }

        for(int i = 1; i <= n; i++){
            char ch1 = word1.charAt(i - 1);
            for(int j = 1; j <= m; j++){
                char ch2 = word2.charAt(j - 1);
                if(ch1 == ch2) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.min(Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1), dp[i - 1][j - 1] + 1);
            }
        }
        return dp[n][m];
    }
}
//本题核心:维护一个二维数组 dp ，dp[i][j]表示word1[i-1]和word2[j-1]之间的编辑距离
//共有三种可能
//1.word1[i-1] == word2[j-1]，则 dp[i][j] = dp[i-1][j-1] 指针所指元素相同无需变化
//2.word1[i-1] != word2[j-1]，则 所指元素不相同则需要继续修改操作
//3.dp[i][j] = dp[i-1][j] + 1 表示word2元素过多，需要删除word2元素
//4.dp[i][j] = dp[i][j-1] + 1 表示word2 元素过少，需要增加word2元素
