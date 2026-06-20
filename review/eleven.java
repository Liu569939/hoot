package review;

public class eleven {
    //hoot 11 盛最多水的容器
    public int maxArea(int[] height) {
        int left =0 ;
        int right = height.length-1;
        int maxArea = 0;
        while(right>left){
            int width = Math.min(height[left],height[right]);
            maxArea  = Math.max(maxArea,width*(right-left));
            while(left<right && height[left]<=width) left++;
            while(left<right && height[right]<=width) right--;
        }return maxArea
}
