
public class fortwentyseven {
    //hoot108 将有序数组转换为二叉搜索树

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {

            if(nums==null||nums.length==0){
                return null;
            }
            return   sorted(nums,0,nums.length-1);

        }
        public TreeNode sorted(int []nums,int i,int j){
            if(i>j){return null;
            }
            int mid = (i+j)/2;
            TreeNode root = new TreeNode();
            root.val = nums[mid];
            root.left = sorted(nums,i,mid-1);
            root.right = sorted(nums,mid+1,j);
            return root;
        }
    }
}
