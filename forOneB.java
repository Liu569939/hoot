import java.util.Arrays;

public class forOneB {
    //hoot-53 最大子数组和;
    public static void main(String[] args) {
        System.out.println( maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(max>=0){
                nums[i]+=max;
            }
            if (nums[i]+max<0){
                max =0;
            }else {
                max = temp+max;
            }
        }
        return  Arrays.stream(nums).max().getAsInt();
    }
}
