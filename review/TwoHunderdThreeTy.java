package review;

public class TwoHunderdThreeTy {
    //hoot 230 二叉搜索树中第K小的元素
    int ans,i=0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
    public void  inorder(TreeNode root,int k){
        if(root == null) return ;
        inorder(root.left,k);
        ++i;
        if(i==k){
            ans = root.val;
        }
        inorder(root.right,k);

    }
}
//本题核心：维护一个变量，当递归到最小值后每一次回溯则做自增运算
//变量表示当前为二叉搜索数中第i小的值
