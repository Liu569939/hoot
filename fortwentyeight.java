public class fortwentyeight {
    //hoot114 二叉树展开为链表
    class Solution {
        public void flatten (TreeNode root){
            TreeNode node = root;
            while(node!=null){
                if(node.left!=null){
                    TreeNode right = node.left;
                    while(right.right!=null){//这里注意不能写
//                        TreeNode right = node.left.right;  // 从left的右子节点开始
//                        while(right != null) {
//                            right = right.right;           // 循环结束时right为null
//                        }
                        right = right.right;
                    }
                    if(node.right!=null){
                        right.right = node.right;
                    }

                    node.right = node.left;
                    node.left  =null;
                }node = node.right;
            }
        }
    }
}
