package review;

public class SevenTyEight {
    //hoot 78 子集
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        ans.add(temp);
        for(int i =0;i<nums.length;i++){
            int len = ans.size();
            for(int j = 0;j<len;j++){
                List<Integer> curr = new ArrayList<>(ans.get(j));
                curr.add(nums[i]);
                ans.add(curr);
            }
        }return ans;
    }
}
//本题核心：通过for循环每次取出已有元素＋nums元素构建新的元素.
