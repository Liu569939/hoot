package review;

public class fortytwo {
    //hoot 42 接雨水
    public int trap(int[] height) {
        int len = height.length;
        if(len<=2) return 0;
        int right = len-1,left =0;
        int ans = 0;
        int maxH= -1;
        int curr = 0;
        while(left<right){
            if(height[left]<=height[right]){
                curr = height[left];
                left++;
            }else{
                curr = height[right];
                right--;
            }
            maxH = Math.max(maxH,curr);
            ans += maxH-curr;
        }
        return ans   ;
    }
}
