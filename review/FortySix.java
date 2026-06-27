package review;

import java.util.ArrayList;
import java.util.List;

public class FortySix {
    int len;
    public List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr       = new ArrayList<>();
        dfs(ans,curr,nums);
        return ans;
    }
    void dfs(List<List<Integer>> ans,List<Integer> curr,int[] nums){
        if(curr.size()==len){ans.add(new ArrayList<>(curr));}
        for(int i =0;i<len;i++){
            if(!curr.contains(nums[i])){
                curr.add(nums[i]);
                dfs(ans,curr,nums);
                curr.remove(curr.size()-1);
            }
        }
    }
}
