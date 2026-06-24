package review;

public class FiveHunderdFortyThree {
    //543 二叉树的直径
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0 ;
        diameter(root);
        return ans-1;

    }
    public int diameter(TreeNode root ){
        if(root == null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        ans = Math.max(left+right+1,ans);
        return Math.max(left,right)+1;
    }
}
//本题核心：和最大深度类似，不过该题需要维护一个ans用于存储最大值
//同时方法每次返回当前子树最大深度，用于父节点计算直径
