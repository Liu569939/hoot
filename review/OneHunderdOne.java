package review;

public class OneHunderdOne {
    //101 对称二叉树
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left,root.right);

    }
    boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null || right == null ||left.val!=right.val) return false;
        return isSymmetric(left.right,right.left)&&isSymmetric(left.left,right.right);
    }

}
//本题核心：
//判断左右子树是否同时为空，仅一方为空
//利用递归判断左右子树的对称性
