public class fivetwentysevenC {
    //hoot 32 最长有效括号
    public int longestValidParentheses(String s) {
        int [] dp =  new int [s.length()];
        if(s.length()==0||s.length()==1){return 0;}
        int maxlen =0;
        for(int i =1;i<s.length();i++){
            if(s.charAt(i)  == ')'){
                if(s.charAt(i-1) =='('){
                    dp[i] = (i-2>0?dp[i-2]:0)+2;
                }else if(i-dp[i-1]>0&&s.charAt(i-dp[i-1]-1)  == '('){
                    dp[i] = dp[i-1] +2+(i-dp[i-1]-2>0?dp[i-dp[i-1]-2]:0);
                }
            }maxlen = Math.max(maxlen,dp[i]);
        }return maxlen;
    }
}
//与其他动态规划解题思路一样，维护一个等长数组 记录max值
