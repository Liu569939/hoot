public class sixfiveE {
    //hoot 33 搜索旋转排序数组
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] >= nums[left]){ //左半有序
                if (target < nums[mid] && target >=nums[left]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else { //右半有序
                if (target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
//本题核心:先遍历查找找到
