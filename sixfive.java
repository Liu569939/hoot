public class sixfive {
    //hoot 153 寻找旋转排序数组中的最小值
    public int findMin(int[] nums) {
        int len = nums.length-1;
        int left = 0;
        int right = len-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]>nums[len]){left = mid+1;}
            else{right = mid-1;}
        }
        return nums[left];

    }
}
//本题核心 用mid中间值和nums[length]不断比较
//为什么是和nums[length]做比较？
//1 .若中间值大于末尾值则表示  mid - length部分出现了旋转位置，升序关系发生变化。同时mid前的数值保持升序且均大于nums【length】，此时左指针右移
//2 .若中间值小于末尾值则表示  mid - length部分单调递增均大于nums[mid] 此时右指针左移
