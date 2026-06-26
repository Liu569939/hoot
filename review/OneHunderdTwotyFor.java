package review;

public class OneHunderdTwotyFor {
    //hoot 124 二叉树的最大路径和
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        int i =  maxPath(root);
        return max;
    }
    int maxPath(TreeNode root){
        if(root == null) {return 0;}
        int left = Math.max(maxPath(root.left),0);
        int right = Math.max(maxPath(root.right),0);
        int sum  = root.val+left+right;
        max = Math.max(sum,max);
        return root.val+Math.max(left,right);
    }
}
