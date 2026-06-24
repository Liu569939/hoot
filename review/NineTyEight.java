package review;

public class NineTyEight {
    //hoot 98 验证二叉搜索树
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root ,Long.MIN_VALUE,Long.MAX_VALUE);

    }
    boolean isValidBST(TreeNode root,long mix,long max){
        if(root == null) return true;
        if(root.val>=max||root.val<=mix) return false;
        return isValidBST(root.left,mix,root.val) &&isValidBST(root.right,root.val,max);
    }
}
//本题核心：通过递归来传递参数进行判断
