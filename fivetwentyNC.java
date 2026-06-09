public class fivetwentyNC {
    //hoot 437 路径总和III
    private int targetSum;
    public int pathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        Map<Long,Integer> map = new HashMap<>();
        map.put(0L,1);
        return   dfs(map,root,0L);
    }
    int dfs(Map<Long,Integer> map,TreeNode root,Long pre){
        if(root==null){return 0;}
        pre += root.val;
        int curr = map.getOrDefault((pre-targetSum),0);
        map.put(pre,map.getOrDefault(pre,0)+1);
        curr += dfs(map,root.left,pre);
        curr +=dfs(map,root.right,pre);
        map.put(pre,map.get(pre)-1);
        return curr;
    }
}
//利用前缀和思想，与求和为K的连续子数列类似

