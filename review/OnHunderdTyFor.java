package review;

public class OnHunderdTyFor {
    //hoot 114 二叉树展开为链表
    public void flatten (TreeNode root){
        TreeNode node = root;
        while(node!=null){
            if(node.left!=null){

                TreeNode curr = node.left;
                while(curr.right!=null){
                    curr = curr.right;
                }
                curr.right = node.right;
                node.right = node.left;
                node.left =null;
            }node = node.right;
        }
    }
}
//本题核心：层层递归，将右子树挂在左子树最右节点上，在将左子树挂在右节点，将左节点置为空
