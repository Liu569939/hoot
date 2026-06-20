package review;

public class one {
    //hoot 1 两数之和
    public  int [] twoSum (int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int [] ans = new int [2];
        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            }else{
                ans.add(map.get(target  - nums[i]));
                ans.add(i);
            }
        }return ans;
    }
}
