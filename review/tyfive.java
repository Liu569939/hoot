package review;

public class tyfive {
    //hoot 15 三数之和
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0 ;i<len-2;i++){
            if(nums[i]>0)  break;
            if(i>0&&nums[i]==nums[i-1])continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) break;


            if (nums[i] + nums[len - 2] + nums[len - 1] < 0) continue;
            int temp =  -nums[i];
            int right = len-1;
            int left = i+1;
            while(left<right){
                int sum = nums[left] +nums[right];
                if(sum>temp) right--;
                else if(sum<temp) left++;
                else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1]) left++;
                    while(left<right&&nums[right]==nums[right+1]) right--;
                }
            }
        }return ans;
    }
}
