public class fivetwentyN {
    //124 二叉树中的最大路径和
    public int maxPathSum(TreeNode root) {

        dfs(root);
        return max;
    }
    int dfs(TreeNode root){
        if(root==null){return 0;}
        int left = Math.max(dfs(root.left),0);
        int right = Math.max(dfs(root.right),0);
        int sum = root.val+left+right;
        max = Math.max(sum,max);
        return root.val+Math.max(left,right);
    }
}
//该题  二叉树最大深度类似，均是左右字根最大值加上当前节点返回
//同时维护一个最大值，每次比较最大值和 当前节点值+左右树，但该题需要考虑负数的情况，所以要加上Math.max(0,left+right+root.val)
