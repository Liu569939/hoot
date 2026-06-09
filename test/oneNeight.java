package test;

public class oneNeight {
    //hoot //198打家劫舍
    public int rob(int[] nums) {
        int [] sum = new int [nums.length+1] ;
        sum[1] = nums[0];
        for(int i=2;i<=nums.length;i++){
            sum[i] = Math.max(sum[i-2]+nums[i-1],sum[i-1]);
        }return sum[sum.length-1];
    }
}
