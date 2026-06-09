public class fivethirteenB {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            combinationSum(ans,candidates, target,new ArrayList<Integer>(),0,0);
            return ans;
        }
        public void combinationSum( List<List<Integer>> ans,int [] candidate,int target,List<Integer> curr,int sum,int index){
            if(sum == target){
                ans.add(new ArrayList<>(curr));
                return;
            }
            else if  (sum<target){
                for(int i=index;i<candidate.length;i++){

                    if(sum+ candidate[i]>target){break;}
                    curr.add(candidate[i]);
                    combinationSum(ans,candidate,target,curr,sum+ candidate[i],i);
                    curr.remove(curr.size()-1);
                }
            }
        }
    }
}
//hoot - 39 组合总和
//值得注意的点首先是不要先把sum+=candidate[i]，先进行计算后续无法回溯
//操作的下标都是i，我们使用index 来记录当前递归的i；
//最后递归调用时仍然使用i，而不是i+1,因为题目提示数组元素可重复使用
