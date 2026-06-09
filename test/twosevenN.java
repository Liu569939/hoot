package test;

public class twosevenN {
    class Solution {
        public int numSquares(int n) {
            int [] ans = new int [n+1];
            int k = 0;
            ans[0]=0;
            for(int i = 1;i<=n;i++){
                k = i ;
                for(int j =1;j*j<=i;j++){
                    k= Math.min(k,ans[i-j*j]+1);
                }
                ans[i] = k;
            }return ans[n];
        }
    }

}
