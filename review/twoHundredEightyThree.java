package review;

public class twoHundredEightyThree {
    //hoot 238 除了自身以外数组的乘积
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] ans = new int [len];
        ans[len-1]  = 1;
        for(int i=len-2;i>=0;i--){
            ans[i] = ans[i+1]*nums[i+1];
        }
        int l =1;
        for(int i=0;i<len;i++){
            ans[i] = ans[i]*l;
            l*= nums[i];
        }return ans;
    }
}
