public class forfifteenB {
    class Solution {
        public int numSquares(int n) {
            int [] newint =new int[n+1];

            for(int i = 1;i<=n;i++){
                newint[i]=i;
                for(int j =1;j*j<=i;j++){
                    newint[i] =Math.min(newint[i],newint[i-j*j]+1);}

            }
            return newint[n];
        }
    }

}
