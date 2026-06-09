public class forthirteenB {
    //hoot 55 跳跃游戏
    public boolean canJump(int[] nums) {
        int length = 0;
        int n =nums.length;
        for(int i =0;i<n;i++){
            if(i<=length){
                length = Math.max(length,i+nums[i]);
            }
            if(length>=n-1){
                return true;
            }
        }return false;

    }
}
