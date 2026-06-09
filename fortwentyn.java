import java.util.ArrayList;
import java.util.List;

public class fortwentyn {
    //hoot46 全排列
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr  = new ArrayList<>();
        bracking(res,nums,curr);
        return res;
    }
    public void bracking(List<List<Integer>> res,int [] nums,List<Integer> curr){
        if(curr.size() == nums.length){
            res.add(new ArrayList<Integer>(curr));
        }
        for(int i =0;i<nums.length;i++){
            if(!curr.contains(nums[i])){
                curr.add(nums[i]);
                bracking (res,  nums, curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}
