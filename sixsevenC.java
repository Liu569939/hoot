public class sixsevenC {
    //hoot 62 不同路径
    public int uniquePaths(int m, int n) {
        int [] dp = new int [n];
        Arrays.fill(dp,1);
        for(int i =1;i<m;i++){
            for(int j = 1;j<n;j++){
                dp[j] = dp[j-1]+dp[j];
            }
        }return dp[n-1];

    }
}
//本题核心: dp[i][j] 只有从上方或左侧移过来的时候才能得到
//第一行或第一列的元素只有一个来源，所以初始化时，dp[i][0] = 1, dp[0][j] = 1
//注意题目已规定 每次只能向下或者向右移动一步，所以这样子考虑，倘若未规定则需要考虑多方位
