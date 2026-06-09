public class fivetwentyNB {
    //hoot 236 二叉树的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null  ||  root==p||root==q){return root;}
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){return root;}
        return left==null?right:left;
    }

}
//注意事项，该题的思路是返回类型
//当p,q为当前节点时直接返回，不管另外一个是否为其字数，因为即使是子树也是返回当前节点。null也返回当前节点
//当左右子树均不为null时表示p,q分布在在节点的左右节点中，直接返回当前节点
