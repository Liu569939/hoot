package review;

public class TwoHunderdTwotySix {
    //226 翻转二叉树
    public TreeNode invertTree(TreeNode root) {
        if(root == null){return root;}
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
//本题核心：先利用递归将左右子树进行翻转，后翻转当前节点左右子树
