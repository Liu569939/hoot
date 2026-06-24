package review;

public class OneHunderdEight {
    // hoot 108 有序数组转换二叉搜索树
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        return  dfs(nums, 0,len-1);
    }
    TreeNode dfs(int[] nums,int left,int right){
        if(right<left){return null;}
        int mid = (left+right)/2;
        TreeNode root =  new TreeNode(nums[mid]);
        root.left = dfs(nums,left,mid-1);
        root.right = dfs(nums,mid+1,right);
        return root;
    }
}
//本题核心：通过不断细化索引来构建二叉搜索树
//细化索引即不断细化数组中间索引
