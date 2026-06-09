public class forfifteen {
    //hoot - 198 打家劫舍
    class Solution {
        public int rob(int[] nums) {
            if(nums ==null||nums.length ==0){
                return 0;
            }
            if(nums.length ==1){
                return nums[0];
            }
            int max1= nums[0];
            int max =Math.max(max1,nums[1]);
            int numslen = nums.length;
            for(int i =2;i<numslen;i++){
                int temp = max;
                max =Math.max(max,max1+nums[i]);
                max1 = temp;
            }
            return max;
        }
}}
