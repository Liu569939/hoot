public class sixfiveB {
    //hoot 35 搜索插入位置
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target==nums[mid]){return mid;}
            else if(target>nums[mid]){left = mid+1;}
            else {right = mid-1;}
        }
        return left;

    }
}
//本题核心:不断利用mid值和target值比较，移动左右指针，一次ac无需多言
