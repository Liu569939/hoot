package review;

public class fivetyOne {
    //hoot 51 N皇后
    int len ;
    public List<List<String>> solveNQueens(int n) {
        len = n;
        List<List<String>> list = new ArrayList<>();
        char[][] dp = new char [n][n];
        for(char [] chars :dp){
            Arrays.fill(chars,'.');
        }
        dfs(list,dp,0);
        return list;

    }
    void dfs(List<List<String>> list,char[][] dp,int start ){
        if(start==len) list.add(new ArrayList<>(buildList(dp)));
        for(int i = 0;i<len;i++){
            if(isVilud(dp,start,i)){
                dp[start][i] = 'Q';
                dfs(list,dp,start+1);
                dp[start][i] = '.';
            }
        }
    }
    boolean isVilud(char[][] dp,int row,int col){
        for(int i = row-1;i>=0;i--){
            if (dp[i][col] == 'Q') return false;
            int curr = col +(row-i);
            if(curr>=0&&curr<len){if(dp[i][curr] =='Q')  return false ;}
            curr = col -(row-i);
            if(curr>=0&&curr<len){if(dp[i][curr] =='Q')  return false ;}
        }   return true;
    }
    List<String>  buildList(char[] [] dp) {
        List<String> list = new ArrayList<>();
        for(char[] c : dp){
            list.add(new String(c));
        }return list;
    }
}
//本题核心：利用递归回溯，逐行放入，同时判断当前放入的位置数值分析，左右对角是否放置皇后
