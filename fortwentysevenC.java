public class fortwentysevenC {
    //230  二叉搜索树中第k小的元素
        int i=0,ans;
        public int kthSmallest(TreeNode root, int k) {
            inoder(root,k);
            return ans;
        }
        public  void inoder(TreeNode root,int k ){
            if(root==null){
                return ;
            }
            inoder(root.left,k);
            i++;
            if(i==k){
                ans = root.val;
                return;
            }
            inoder(root.right,k);
        }
    }

