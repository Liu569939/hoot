package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hootontthree {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for(int i  = 0;i<nums.length-2;i++){
                int temp = - nums[i];
                if(nums[i]>0){break;}
                if(i>0&&nums[i]==nums[i-1]) continue;
                int len = nums.length-1;
                int j = i+1;
                while(j<len){
                    int sum = nums[len]+nums[j];
                    if(temp>sum){
                        j++;
                    }
                    else  if(temp<sum){
                        len--;

                    }else{
                        list.add(Arrays.asList(nums[i],nums[j],nums[len]));
                        while (j < len && nums[j] == nums[j + 1]){ j++;}
                        while (j < len && nums[len] == nums[len - 1]){len--;}
                        len--;
                        j++;
                    }

                }
            } return list;
        }
    }
}
//hoot 15 三数之和
//值得注意点有for（int i）如果nums【i】的值大于0则表示数组值均大于0无满足条件，如果nums【i】==nums【i-1】表示出现数值相同
//出现重复判断应当跳过（后续左右指针同理），注意左右指针移动，以及len在每次循环结束后刷新
