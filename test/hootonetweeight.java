package test;

import java.util.Arrays;

public class hootonetweeight {
    class Solution {
        public int longestConsecutive(int [] nums){
            if(nums.length==0){
                return 0;
            }
            Arrays.sort(nums);
            int len = 1;
            int curr = 1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    continue;
                }
                if(nums[i]==nums[i-1]+1){
                    curr++;
                }else{
                    curr=1;
                }
                len = Math.max(len,curr);
            }
            return len;
        }}
}
//hoot 128 最长连续序列
//值得注意的点首先是要避免数组长度为0和1的情况，如果为0，返回0，如果是1，利用int i= 1 ；i<nums.length-1.跳过循环
