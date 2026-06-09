public class forthirteen {
    //hoot  42 跳跃游戏II：返回跳跃最小值
    public int jump(int[] nums) {
        int end = 0;
        int n = nums.length;
        int lengthMax =0;
        int count = 0;
        for(int i=0;i<n-1;i++){
            lengthMax = Math.max(lengthMax,i+nums[i]);
            if(i==end){
                end = lengthMax;
                count++;
            }
        } return count;
    }
}
