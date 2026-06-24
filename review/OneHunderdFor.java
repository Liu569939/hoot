package review;

public class OneHunderdFor {
    //hoot 104 二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root == null ){return 0;}
        int left   =  maxDepth(root.left);
        int right  =  maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
//本题核心：通过递归找出左右子树的最大深度
