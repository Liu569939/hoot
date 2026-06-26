package review;

import java.util.HashMap;
import java.util.Map;

public class ForHunderdThreetySeven {
    //hoot 437 路径总和
    Map<Long,Integer> map = new HashMap<>();
    int target=0;

    public int pathSum(TreeNode root, int targetSum) {
        target=targetSum;
        map.put(0L,1);
        return helper(root,0L);
    }

    private int helper(TreeNode root, Long curSum){
        if(root ==null){
            return 0;
        }

        int res=0;
        curSum+=root.val;

        res+=map.getOrDefault(curSum-target,0);
        map.put(curSum,map.getOrDefault(curSum,0)+1);

        int left = helper(root.left, curSum);
        int right = helper(root.right,curSum);
        res=res+left+right;

        map.put(curSum,map.get(curSum)-1);
        map.
        return res;
    }
}
//本题核心：与和为K的子数组类似，维护一个Map数组，当sum-targerSum为key存在时表示
//中间一段子数组的和为target进行计算
