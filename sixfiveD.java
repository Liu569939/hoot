public class sixfiveD {
    //hoot 34 在排序数组中查找元素的第一个和最后一个位置
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums,target);
        if(first == nums.length||nums[first]!= target){ return new int [] {-1,-1};}
        int second = first+1;
        while(second<nums.length&&nums[second]==target){second++;}
        return new int []{first,second-1};
    }
    int binarySearch(int [] nums,int target){
        int right = nums.length-1;
        int left  = 0;
        while(right>=left){
            int mid = (left+right)/2;
            if(nums[mid]<target){left = mid+1;}
            else{
                right = mid-1;
            }
        }return left;
    }
}
//先利用binarySearch找到最左侧的target索引位置然后不断递增寻找最后一个位置
