package review;

public class OneHunderTwo {
    //hoot 102 二叉树的层序遍历
    List<List<Integer>> ans  = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    void dfs(TreeNode root,int lever){
        if(root == null) return ;
        if(ans.size() == lever){
            ans.add(new ArrayList<>());
        }
        ans.get(lever).add(root.val);
        dfs(root.left,lever+1);
        dfs(root.right,lever+1);
    }
}
//本题核心：通过递归和层数判断，将节点值添加到对应层的列表中
//也可以利用队列进行层序遍历，通过队列存储每一层的节点，然后逐个弹出并添加其子节点
