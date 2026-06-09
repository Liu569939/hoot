public class fivetwentythreeB {
    // hoot 51 N皇后
        public List<List<String>> solveNQueens(int n) {
            List <List<String>> ans = new ArrayList<>();
            char[][] dp = new char [n][n];
            for(int i = 0; i<n; i++){
                Arrays.fill(dp[i],'.');
            }
            dfs(ans,dp,0);
            return ans;
        }
        void dfs(List<List<String>>ans,char[][] dp,int index ){
            if(index ==  dp.length){
                ans.add(buildList(dp));
                return ;
            }
            for(int row =0;row<dp.length;row++){
                if(isVaild(dp,index,row)){
                    dp[index][row] = 'Q';
                    dfs(ans,dp,index+1);
                    dp[index][row] = '.';
                }
            }
        }
        boolean isVaild(char [][] dp ,int index ,int row){
            for(int i =0;i<index;i++){
                if(dp[i][row]=='Q') return false;
                int row1  = row+(index-i);
                int row2  = row-(index-i);
                if(row1<dp.length&&dp[i][row1]=='Q') return false;
                if(row2>=0 && dp[i][row2] =='Q') return false;
            }
            return true;
        }

        List<String> buildList(char [] [] dp){
            List <String> curr = new ArrayList<>();
            for(char [] chars:dp){
                curr.add(new String(chars));
            }
            return curr;
        }

}
