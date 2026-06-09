public class sixsevenD {
    //hoot 64 最小路径和
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int [] dp = grid[0];
        for (int j = 1; j < col; j++) {
            dp[j] += dp[j - 1];
        }
        for(int i = 1;i<row;i++){
            dp[0] +=grid[i][0];
            for(int j =1;j<col;j++){
                dp[j] = dp[j-1]>dp[j]?dp[j]+grid[i][j]:dp[j-1]+grid[i][j];

            }
        }return dp[col-1];
    }
}
//本题核心: dp[i][j] 为上方或左侧移动的最小路径和与不同路径类似
