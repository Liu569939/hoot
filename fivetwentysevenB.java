public class fivetwentysevenB {
    //hoot 416 分割等和子集
    public boolean canPartition(int[] nums) {
        if(nums.length ==1){return false;}
        int sum =0 ;
        for(int num:nums){
            sum += num;
        }
        if(sum%2!=0){return false;}
        int tager = sum/2;
        boolean [] dp = new  boolean [tager+1];
        dp[0] = true;
        for(int num:nums){
            if(num>tager){continue;}
            for (int j = tager; j >= num; j--) {
                if(dp[j-num]) dp[j] =true;
            }
        }return dp[tager];
    }
}
// 0-1 背包问题，维护一个Boolean类型的数组，用于记录nums【i】 是否存入问题
//将平分数组问题转化为子集求和问题
