package review;

public class NineTyFor {
    //hoot 94 二叉树的中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans  = new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    void dfs(TreeNode root ,List<Integer> ans){
        if(root == null) {return ;}
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }
}
//递归遍历二叉树
