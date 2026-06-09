package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hootone {

    public  int [] twoSum (int[] nums,int target){
        Map <Integer,Integer>  map = new HashMap<>();
        int [] ans = new int [2];
        for(int i = 0;i<nums.length;i++){
            int j =  target - nums[i];
            if(map.containsKey( j)){
                ans[0] = i;
                ans[1]=map.get(j);
                return ans;
            }
            map.put(nums[i],i);

        }
        return ans;
    }
}
//hoot001 两数之和
//值得注意点的有如果为了追求空间复杂度可以约去j和ans的空间
//如果追去时间复杂度记得在找到对应数据后即使返回下标
