package review;

public class ThreeTyNine {
    //hoot 39 组合总和
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        bracked(candidates,target,0,list,new ArrayList<>());
        return list;

    }
    void  bracked(int[] candidates,int target,int index,List<List<Integer>> list,List<Integer> curr){
        if(target == 0 ){list.add(new ArrayList<>(curr));return ;}

        for(int i = index;i<candidates.length;i++){
            if (target - candidates[i] < 0) break;
            curr.add(candidates[i]);
            bracked(candidates,target-candidates[i],i,list,curr);
            curr.remove(curr.size()-1);
        }
    }
}
//本题核心：通过不断更新target来递归
