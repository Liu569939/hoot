public class fivefifteen {
    class Solution {
        int [][] ans = {{1,0},{-1,0},{0,1},{0,-1}};
        public boolean exist(char[][] board, String word) {
            for(int i=0;i<board.length;i++){
                for(int j =0;j<board[i].length;j++){
                    if(dfs(board,i,j,word,0)){
                        return true;
                    }
                }
            }return false;

        }
        boolean dfs(char[][] board,int i,int j ,String word,int k){
            if(k == word.length()-1) {return board[i][j] == word.charAt(k);}
            if(board[i][j]!=word.charAt(k)){return false;}
            board[i][j] = '0';
            for (int[] index : ans) {
                int x = i + index[0];
                int y = j + index[1];
                if (x >= 0 && x < board.length && y >= 0 && y < board[0].length
                        && dfs(board, x, y, word, k + 1)) {
                    return true;
                }
            }
            board[i][j] = word.charAt(k);
            return false;
        }
    }
}//hoot - 79 单词搜索
//注意事项:先要ans置一个二维数组，然后进行遍历，然后进行判断，然后进行回溯，然后进行返回。
//抖音搜索详情 这个东西讲不清
