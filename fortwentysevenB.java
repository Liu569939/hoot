/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class fortwentysevenB {
    //hoot98 验证二叉搜索树
    public boolean isValidBST(TreeNode root) {
        return isVaild(root);
    }
    public boolean isVaild(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left!=null&&root.val<=root.left.val){
            return false;
        }
        if(root.right!=null&&root.val>=root.right.val){
            return false;
        }
        if(root.right==null){
            return false;
        }
        return isVaild(root.left)&&isVaild(root.right);
    }
}

//上面代码问题:
//核心问题
//        只检查了局部父子关系，未验证全局 BST 性质
//        BST 要求：
//        左子树所有节点 < 根节点
//右子树所有节点 > 根节点
//        当前代码仅检查直接子节点，无法发现跨层级的违规。
//class Solution {
//    public boolean isValidBST(TreeNode root) {
//        return isVaild(root,Long.MIN_VALUE,Long.MAX_VALUE);
//    }
//    public boolean isVaild(TreeNode root,long min,long max){
//        if(root == null){
//            return true;
//        }
//        if(root.val<=min||root.val>=max){
//            return false;
//        }
//        return isVaild(root.left,min,root.val)&&isVaild(root.right,root.val,max);
//    }
//}
